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

public class atd implements atk {
   static final Logger a = LogUtils.getLogger();
   private static final ask b = new ask(false, atf.b.a, false);
   private final Path c;
   private final asl d;
   private final atj e;
   private final euc f;

   public atd(Path $$0, asl $$1, atj $$2, euc $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void loadPacks(Consumer<atf> $$0) {
      try {
         v.c(this.c);
         a(this.c, this.f, ($$1, $$2) -> {
            asi $$3 = this.b($$1);
            atf $$4 = atf.a($$3, $$2, this.d, b);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.c, var3);
      }
   }

   private asi b(Path $$0) {
      String $$1 = a($$0);
      return new asi("file/" + $$1, wx.b($$1), this.e, Optional.empty());
   }

   public static void a(Path $$0, euc $$1, BiConsumer<Path, atf.c> $$2) throws IOException {
      atd.a $$3 = new atd.a($$1);

      try (DirectoryStream<Path> $$4 = Files.newDirectoryStream($$0)) {
         for (Path $$5 : $$4) {
            try {
               List<eud> $$6 = new ArrayList<>();
               atf.c $$7 = $$3.a($$5, $$6);
               if (!$$6.isEmpty()) {
                  a.warn("Ignoring potential pack entry: {}", eub.a($$5, $$6));
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

   static class a extends ath<atf.c> {
      protected a(euc $$0) {
         super($$0);
      }

      @Nullable
      protected atf.c a(Path $$0) {
         FileSystem $$1 = $$0.getFileSystem();
         if ($$1 != FileSystems.getDefault() && !($$1 instanceof ast)) {
            atd.a.info("Can't open pack archive at {}", $$0);
            return null;
         } else {
            return new asg.a($$0);
         }
      }

      protected atf.c b(Path $$0) {
         return new asm.a($$0);
      }
   }
}
