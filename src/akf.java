import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class akf implements akk {
   private static final Logger a = LogUtils.getLogger();
   private final Path b;
   private final ajm c;
   private final akj d;

   public akf(Path $$0, ajm $$1, akj $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void a(Consumer<akg> $$0) {
      try {
         v.c(this.b);
         a(this.b, false, ($$1, $$2) -> {
            String $$3 = a($$1);
            akg $$4 = akg.a("file/" + $$3, sw.b($$3), false, $$2, this.c, akg.b.a, this.d);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.b, var3);
      }
   }

   public static void a(Path $$0, boolean $$1, BiConsumer<Path, akg.c> $$2) throws IOException {
      try (DirectoryStream<Path> $$3 = Files.newDirectoryStream($$0)) {
         for (Path $$4 : $$3) {
            akg.c $$5 = a($$4, $$1);
            if ($$5 != null) {
               $$2.accept($$4, $$5);
            }
         }
      }
   }

   @Nullable
   public static akg.c a(Path $$0, boolean $$1) {
      BasicFileAttributes $$2;
      try {
         $$2 = Files.readAttributes($$0, BasicFileAttributes.class);
      } catch (NoSuchFileException var5) {
         return null;
      } catch (IOException var6) {
         a.warn("Failed to read properties of '{}', ignoring", $$0, var6);
         return null;
      }

      if ($$2.isDirectory() && Files.isRegularFile($$0.resolve("pack.mcmeta"))) {
         return $$2x -> new ajn($$2x, $$0, $$1);
      } else {
         if ($$2.isRegularFile() && $$0.getFileName().toString().endsWith(".zip")) {
            FileSystem $$6 = $$0.getFileSystem();
            if ($$6 == FileSystems.getDefault() || $$6 instanceof aju) {
               File $$7 = $$0.toFile();
               return $$2x -> new ajk($$2x, $$7, $$1);
            }
         }

         a.info("Found non-pack entry '{}', ignoring", $$0);
         return null;
      }
   }
}
