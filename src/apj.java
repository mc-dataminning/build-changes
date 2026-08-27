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

public class apj implements app {
   static final Logger a = LogUtils.getLogger();
   private final Path b;
   private final aor c;
   private final apo d;
   private final elc e;

   public apj(Path $$0, aor $$1, apo $$2, elc $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void a(Consumer<apk> $$0) {
      try {
         v.c(this.b);
         a(this.b, this.e, false, ($$1, $$2) -> {
            String $$3 = a($$1);
            apk $$4 = apk.a("file/" + $$3, vd.b($$3), false, $$2, this.c, apk.b.a, this.d);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.b, var3);
      }
   }

   public static void a(Path $$0, elc $$1, boolean $$2, BiConsumer<Path, apk.c> $$3) throws IOException {
      apj.a $$4 = new apj.a($$1, $$2);

      try (DirectoryStream<Path> $$5 = Files.newDirectoryStream($$0)) {
         for (Path $$6 : $$5) {
            try {
               List<eld> $$7 = new ArrayList<>();
               apk.c $$8 = $$4.a($$6, $$7);
               if (!$$7.isEmpty()) {
                  a.warn("Ignoring potential pack entry: {}", elb.a($$6, $$7));
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

   static class a extends apm<apk.c> {
      private final boolean a;

      protected a(elc $$0, boolean $$1) {
         super($$0);
         this.a = $$1;
      }

      @Nullable
      protected apk.c a(Path $$0) {
         FileSystem $$1 = $$0.getFileSystem();
         if ($$1 != FileSystems.getDefault() && !($$1 instanceof aoz)) {
            apj.a.info("Can't open pack archive at {}", $$0);
            return null;
         } else {
            return new aoo.a($$0, this.a);
         }
      }

      protected apk.c b(Path $$0) {
         return new aos.a($$0, this.a);
      }
   }
}
