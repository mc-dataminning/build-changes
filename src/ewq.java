import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class ewq {
   private final PathMatcher a;

   public ewq(PathMatcher $$0) {
      this.a = $$0;
   }

   public void a(Path $$0, List<ewr> $$1) throws IOException {
      Path $$2 = Files.readSymbolicLink($$0);
      if (!this.a.matches($$2)) {
         $$1.add(new ewr($$0, $$2));
      }
   }

   public List<ewr> a(Path $$0) throws IOException {
      List<ewr> $$1 = new ArrayList<>();
      this.a($$0, $$1);
      return $$1;
   }

   public List<ewr> a(Path $$0, boolean $$1) throws IOException {
      List<ewr> $$2 = new ArrayList<>();

      BasicFileAttributes $$3;
      try {
         $$3 = Files.readAttributes($$0, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
      } catch (NoSuchFileException var6) {
         return $$2;
      }

      if ($$3.isRegularFile()) {
         throw new IOException("Path " + $$0 + " is not a directory");
      } else {
         if ($$3.isSymbolicLink()) {
            if (!$$1) {
               this.a($$0, $$2);
               return $$2;
            }

            $$0 = Files.readSymbolicLink($$0);
         }

         this.b($$0, $$2);
         return $$2;
      }
   }

   public void b(Path $$0, final List<ewr> $$1) throws IOException {
      Files.walkFileTree($$0, new SimpleFileVisitor<Path>() {
         private void c(Path $$0, BasicFileAttributes $$1x) throws IOException {
            if ($$1.isSymbolicLink()) {
               ewq.this.a($$0, $$1);
            }
         }

         public FileVisitResult a(Path $$0, BasicFileAttributes $$1x) throws IOException {
            this.c($$0, $$1);
            return super.preVisitDirectory($$0, $$1);
         }

         public FileVisitResult b(Path $$0, BasicFileAttributes $$1x) throws IOException {
            this.c($$0, $$1);
            return super.visitFile($$0, $$1);
         }
      });
   }
}
