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

public class aum implements aut {
   static final Logger a = LogUtils.getLogger();
   private static final atu b = new atu(false, auo.b.a, false);
   private final Path c;
   private final atv d;
   private final aus e;
   private final ffi f;

   public aum(Path $$0, atv $$1, aus $$2, ffi $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void loadPacks(Consumer<auo> $$0) {
      try {
         w.c(this.c);
         a(this.c, this.f, ($$1, $$2) -> {
            ats $$3 = this.b($$1);
            auo $$4 = auo.a($$3, $$2, this.d, b);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.c, var3);
      }
   }

   private ats b(Path $$0) {
      String $$1 = a($$0);
      return new ats("file/" + $$1, xc.b($$1), this.e, Optional.empty());
   }

   public static void a(Path $$0, ffi $$1, BiConsumer<Path, auo.c> $$2) throws IOException {
      aum.a $$3 = new aum.a($$1);

      try (DirectoryStream<Path> $$4 = Files.newDirectoryStream($$0)) {
         for (Path $$5 : $$4) {
            try {
               List<ffj> $$6 = new ArrayList<>();
               auo.c $$7 = $$3.a($$5, $$6);
               if (!$$6.isEmpty()) {
                  a.warn("Ignoring potential pack entry: {}", ffh.a($$5, $$6));
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

   static class a extends auq<auo.c> {
      protected a(ffi $$0) {
         super($$0);
      }

      @Nullable
      protected auo.c a(Path $$0) {
         FileSystem $$1 = $$0.getFileSystem();
         if ($$1 != FileSystems.getDefault() && !($$1 instanceof aud)) {
            aum.a.info("Can't open pack archive at {}", $$0);
            return null;
         } else {
            return new atq.a($$0);
         }
      }

      protected auo.c b(Path $$0) {
         return new atw.a($$0);
      }
   }
}
