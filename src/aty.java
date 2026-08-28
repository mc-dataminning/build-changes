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

public class aty implements auf {
   static final Logger a = LogUtils.getLogger();
   private static final atf b = new atf(false, aua.b.a, false);
   private final Path c;
   private final atg d;
   private final aue e;
   private final exu f;

   public aty(Path $$0, atg $$1, aue $$2, exu $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void loadPacks(Consumer<aua> $$0) {
      try {
         v.c(this.c);
         a(this.c, this.f, ($$1, $$2) -> {
            atd $$3 = this.b($$1);
            aua $$4 = aua.a($$3, $$2, this.d, b);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.c, var3);
      }
   }

   private atd b(Path $$0) {
      String $$1 = a($$0);
      return new atd("file/" + $$1, xd.b($$1), this.e, Optional.empty());
   }

   public static void a(Path $$0, exu $$1, BiConsumer<Path, aua.c> $$2) throws IOException {
      aty.a $$3 = new aty.a($$1);

      try (DirectoryStream<Path> $$4 = Files.newDirectoryStream($$0)) {
         for (Path $$5 : $$4) {
            try {
               List<exv> $$6 = new ArrayList<>();
               aua.c $$7 = $$3.a($$5, $$6);
               if (!$$6.isEmpty()) {
                  a.warn("Ignoring potential pack entry: {}", ext.a($$5, $$6));
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

   static class a extends auc<aua.c> {
      protected a(exu $$0) {
         super($$0);
      }

      @Nullable
      protected aua.c a(Path $$0) {
         FileSystem $$1 = $$0.getFileSystem();
         if ($$1 != FileSystems.getDefault() && !($$1 instanceof ato)) {
            aty.a.info("Can't open pack archive at {}", $$0);
            return null;
         } else {
            return new atb.a($$0);
         }
      }

      protected aua.c b(Path $$0) {
         return new ath.a($$0);
      }
   }
}
