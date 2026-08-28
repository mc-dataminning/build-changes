import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class auf implements aum {
   static final Logger a = LogUtils.getLogger();
   private static final atm b = new atm(false, auh.b.a, false);
   private final Path c;
   private final atn d;
   private final aul e;
   private final eyx f;

   public auf(Path $$0, atn $$1, aul $$2, eyx $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void loadPacks(Consumer<auh> $$0) {
      try {
         v.c(this.c);
         a(this.c, this.f, ($$1, $$2) -> {
            atk $$3 = this.b($$1);
            auh $$4 = auh.a($$3, $$2, this.d, b);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.c, var3);
      }
   }

   private atk b(Path $$0) {
      String $$1 = a($$0);
      return new atk("file/" + $$1, xh.b($$1), this.e, Optional.empty());
   }

   public static void a(Path $$0, eyx $$1, BiConsumer<Path, auh.c> $$2) throws IOException {
      auf.a $$3 = new auf.a($$1);

      try (DirectoryStream<Path> $$4 = Files.newDirectoryStream($$0)) {
         for (Path $$5 : $$4) {
            try {
               List<eyy> $$6 = new ArrayList<>();
               auh.c $$7 = $$3.a($$5, $$6);
               if (!$$6.isEmpty()) {
                  a.warn("Ignoring potential pack entry: {}", eyw.a($$5, $$6));
               } else if ($$7 != null) {
                  $$2.accept($$5, $$7);
               } else {
                  a.info("Found non-pack entry '{}', ignoring", $$5);
               }
            } catch (IOException var10) {
               a.warn("Failed to read properties of '{}', ignoring", $$5, var10);
            }
         }
      }
   }

   static class a extends auj<auh.c> {
      protected a(eyx $$0) {
         super($$0);
      }

      @Nullable
      protected auh.c a(Path $$0) {
         FileSystem $$1 = $$0.getFileSystem();
         if ($$1 != FileSystems.getDefault() && !($$1 instanceof atv)) {
            auf.a.info("Can't open pack archive at {}", $$0);
            return null;
         } else {
            return new ati.a($$0);
         }
      }

      protected auh.c b(Path $$0) {
         return new ato.a($$0);
      }
   }
}
