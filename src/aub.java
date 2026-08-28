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

public class aub implements aui {
   static final Logger a = LogUtils.getLogger();
   private static final ati b = new ati(false, aud.b.a, false);
   private final Path c;
   private final atj d;
   private final auh e;
   private final eym f;

   public aub(Path $$0, atj $$1, auh $$2, eym $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void loadPacks(Consumer<aud> $$0) {
      try {
         v.c(this.c);
         a(this.c, this.f, ($$1, $$2) -> {
            atg $$3 = this.b($$1);
            aud $$4 = aud.a($$3, $$2, this.d, b);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.c, var3);
      }
   }

   private atg b(Path $$0) {
      String $$1 = a($$0);
      return new atg("file/" + $$1, xe.b($$1), this.e, Optional.empty());
   }

   public static void a(Path $$0, eym $$1, BiConsumer<Path, aud.c> $$2) throws IOException {
      aub.a $$3 = new aub.a($$1);

      try (DirectoryStream<Path> $$4 = Files.newDirectoryStream($$0)) {
         for (Path $$5 : $$4) {
            try {
               List<eyn> $$6 = new ArrayList<>();
               aud.c $$7 = $$3.a($$5, $$6);
               if (!$$6.isEmpty()) {
                  a.warn("Ignoring potential pack entry: {}", eyl.a($$5, $$6));
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

   static class a extends auf<aud.c> {
      protected a(eym $$0) {
         super($$0);
      }

      @Nullable
      protected aud.c a(Path $$0) {
         FileSystem $$1 = $$0.getFileSystem();
         if ($$1 != FileSystems.getDefault() && !($$1 instanceof atr)) {
            aub.a.info("Can't open pack archive at {}", $$0);
            return null;
         } else {
            return new ate.a($$0);
         }
      }

      protected aud.c b(Path $$0) {
         return new atk.a($$0);
      }
   }
}
