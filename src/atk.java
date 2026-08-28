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

public class atk implements atr {
   static final Logger a = LogUtils.getLogger();
   private static final asr b = new asr(false, atm.b.a, false);
   private final Path c;
   private final ass d;
   private final atq e;
   private final ews f;

   public atk(Path $$0, ass $$1, atq $$2, ews $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void loadPacks(Consumer<atm> $$0) {
      try {
         v.c(this.c);
         a(this.c, this.f, ($$1, $$2) -> {
            asp $$3 = this.b($$1);
            atm $$4 = atm.a($$3, $$2, this.d, b);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.c, var3);
      }
   }

   private asp b(Path $$0) {
      String $$1 = a($$0);
      return new asp("file/" + $$1, wz.b($$1), this.e, Optional.empty());
   }

   public static void a(Path $$0, ews $$1, BiConsumer<Path, atm.c> $$2) throws IOException {
      atk.a $$3 = new atk.a($$1);

      try (DirectoryStream<Path> $$4 = Files.newDirectoryStream($$0)) {
         for (Path $$5 : $$4) {
            try {
               List<ewt> $$6 = new ArrayList<>();
               atm.c $$7 = $$3.a($$5, $$6);
               if (!$$6.isEmpty()) {
                  a.warn("Ignoring potential pack entry: {}", ewr.a($$5, $$6));
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

   static class a extends ato<atm.c> {
      protected a(ews $$0) {
         super($$0);
      }

      @Nullable
      protected atm.c a(Path $$0) {
         FileSystem $$1 = $$0.getFileSystem();
         if ($$1 != FileSystems.getDefault() && !($$1 instanceof ata)) {
            atk.a.info("Can't open pack archive at {}", $$0);
            return null;
         } else {
            return new asn.a($$0);
         }
      }

      protected atm.c b(Path $$0) {
         return new ast.a($$0);
      }
   }
}
