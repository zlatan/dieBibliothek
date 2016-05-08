package org.kili.derBibliothek;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Bean
    public CommandLineRunner fillBooks(BookRepository brepository, StudentRepository srepository, LibraryCardRecordRepository lrepository) {
        return (args) -> {
            brepository.save(new Book("The Singularity Is Near", "Ray Kurzweil", "1", "2005",15.63,"signatura","15-12.04.2011","12232432"));
            brepository.save(new Book("Reason in History","G.W.F. Hegel" , "1", "1995", 16.29, "signatura", "11-11.1.2111","23244532"));
            brepository.save(new Book("Singularity Is Near", "Ray Kurzweil", "1", "2005",15.63,"signatura","15-12.04.2011","23411245"));
            brepository.save(new Book("Reason","G.W.F. Hegel" , "1", "1995", 16.29, "signatura", "11-11.1.2111","23432"));
            srepository.save(new Student(12,1999,"Muncho","Penchev","11A","qwe123ds2vfve"));
            srepository.save(new Student(21,1999,"Pencho","Munchev","11A","afwef24543253"));
/*
            BookManagment book= new BookManagment(brepository,srepository,lrepository);
            book.BorrowBook("qwe123ds2vfve","23244532");
            book.BorrowBook("afwef24543253","12232432");
            book.UnBorrowBook("afwef24543253","12232432");
            book.UnBorrowBook("qwe123ds2vfve","23244532");

*/
        };
    }

}
