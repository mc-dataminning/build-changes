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

public class auq implements auy {
   static final Logger a = LogUtils.getLogger();
   private static final atx b = new atx(false, aus.b.a, false);
   private final Path c;
   private final aty d;
   private final auw e;
   private final fbh f;

   public auq(Path $$0, aty $$1, auw $$2, fbh $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void loadPacks(Consumer<aus> $$0) {
      try {
         v.c(this.c);
         a(this.c, this.f, ($$1, $$2) -> {
            atv $$3 = this.b($$1);
            aus $$4 = aus.a($$3, $$2, this.d, b);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.c, var3);
      }
   }

   private atv b(Path $$0) {
      String $$1 = a($$0);
      return new atv("file/" + $$1, xk.b($$1), this.e, Optional.empty());
   }

   public static void a(Path $$0, fbh $$1, BiConsumer<Path, aus.c> $$2) throws IOException {
      auq.a $$3 = new auq.a($$1);

      try (DirectoryStream<Path> $$4 = Files.newDirectoryStream($$0)) {
         for (Path $$5 : $$4) {
            try {
               List<fbi> $$6 = new ArrayList<>();
               aus.c $$7 = $$3.a($$5, $$6);
               if (!$$6.isEmpty()) {
                  a.warn("Ignoring potential pack entry: {}", fbg.a($$5, $$6));
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

   static class a extends auu<aus.c> {
      protected a(fbh $$0) {
         super($$0);
      }

      @Nullable
      protected aus.c a(Path $$0) {
         FileSystem $$1 = $$0.getFileSystem();
         if ($$1 != FileSystems.getDefault() && !($$1 instanceof aug)) {
            auq.a.info("Can't open pack archive at {}", $$0);
            return null;
         } else {
            return new att.a($$0);
         }
      }

      protected aus.c b(Path $$0) {
         return new atz.a($$0);
      }
   }
}
