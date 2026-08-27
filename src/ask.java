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

public class ask implements asr {
   static final Logger a = LogUtils.getLogger();
   private static final arr b = new arr(false, asm.b.a, false);
   private final Path c;
   private final ars d;
   private final asq e;
   private final erz f;

   public ask(Path $$0, ars $$1, asq $$2, erz $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void loadPacks(Consumer<asm> $$0) {
      try {
         v.c(this.c);
         a(this.c, this.f, ($$1, $$2) -> {
            arp $$3 = this.b($$1);
            asm $$4 = asm.a($$3, $$2, this.d, b);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.c, var3);
      }
   }

   private arp b(Path $$0) {
      String $$1 = a($$0);
      return new arp("file/" + $$1, wi.b($$1), this.e, Optional.empty());
   }

   public static void a(Path $$0, erz $$1, BiConsumer<Path, asm.c> $$2) throws IOException {
      ask.a $$3 = new ask.a($$1);

      try (DirectoryStream<Path> $$4 = Files.newDirectoryStream($$0)) {
         for (Path $$5 : $$4) {
            try {
               List<esa> $$6 = new ArrayList<>();
               asm.c $$7 = $$3.a($$5, $$6);
               if (!$$6.isEmpty()) {
                  a.warn("Ignoring potential pack entry: {}", ery.a($$5, $$6));
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

   static class a extends aso<asm.c> {
      protected a(erz $$0) {
         super($$0);
      }

      @Nullable
      protected asm.c a(Path $$0) {
         FileSystem $$1 = $$0.getFileSystem();
         if ($$1 != FileSystems.getDefault() && !($$1 instanceof asa)) {
            ask.a.info("Can't open pack archive at {}", $$0);
            return null;
         } else {
            return new arn.a($$0);
         }
      }

      protected asm.c b(Path $$0) {
         return new art.a($$0);
      }
   }
}
