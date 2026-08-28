import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import javax.annotation.Nullable;

public abstract class aum<T> {
   private final fes a;

   protected aum(fes $$0) {
      this.a = $$0;
   }

   @Nullable
   public T a(Path $$0, List<fet> $$1) throws IOException {
      Path $$2 = $$0;

      BasicFileAttributes $$3;
      try {
         $$3 = Files.readAttributes($$0, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
      } catch (NoSuchFileException var6) {
         return null;
      }

      if ($$3.isSymbolicLink()) {
         this.a.a($$0, $$1);
         if (!$$1.isEmpty()) {
            return null;
         }

         $$2 = Files.readSymbolicLink($$0);
         $$3 = Files.readAttributes($$2, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
      }

      if ($$3.isDirectory()) {
         this.a.b($$2, $$1);
         if (!$$1.isEmpty()) {
            return null;
         } else {
            return !Files.isRegularFile($$2.resolve("pack.mcmeta")) ? null : this.c($$2);
         }
      } else {
         return $$3.isRegularFile() && $$2.getFileName().toString().endsWith(".zip") ? this.d($$2) : null;
      }
   }

   @Nullable
   protected abstract T d(Path var1) throws IOException;

   @Nullable
   protected abstract T c(Path var1) throws IOException;
}
