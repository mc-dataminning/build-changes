import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arh implements arn {
   static final Logger a = LogUtils.getLogger();
   private final Path b;
   private final aqp c;
   private final arm d;
   private final eni e;

   public arh(Path $$0, aqp $$1, arm $$2, eni $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void loadPacks(Consumer<ari> $$0) {
      try {
         v.c(this.b);
         a(this.b, this.e, false, ($$1, $$2) -> {
            String $$3 = a($$1);
            ari $$4 = ari.a("file/" + $$3, vq.b($$3), false, $$2, this.c, ari.b.a, this.d);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.b, var3);
      }
   }

   public static void a(Path $$0, eni $$1, boolean $$2, BiConsumer<Path, ari.c> $$3) throws IOException {
      arh.a $$4 = new arh.a($$1, $$2);

      try (DirectoryStream<Path> $$5 = Files.newDirectoryStream($$0)) {
         for (Path $$6 : $$5) {
            try {
               List<enj> $$7 = new ArrayList<>();
               ari.c $$8 = $$4.a($$6, $$7);
               if (!$$7.isEmpty()) {
                  a.warn("Ignoring potential pack entry: {}", enh.a($$6, $$7));
               } else if ($$8 != null) {
                  $$3.accept($$6, $$8);
               } else {
                  a.info("Found non-pack entry '{}', ignoring", $$6);
               }
            } catch (IOException var11) {
               a.warn("Failed to read properties of '{}', ignoring", $$6, var11);
            }
         }
      }
   }

   static class a extends ark<ari.c> {
      private final boolean a;

      protected a(eni $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      @Nullable
      protected ari.c a(Path $$0) {
         FileSystem $$1 = $$0.getFileSystem();
         if ($$1 != FileSystems.getDefault() && !($$1 instanceof aqx)) {
            arh.a.info("Can't open pack archive at {}", $$0);
            return null;
         } else {
            return new aqm.a($$0, this.a);
         }
      }

      protected ari.c b(Path $$0) {
         return new aqq.a($$0, this.a);
      }
   }
}
