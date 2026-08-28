import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import org.slf4j.Logger;

public class eqa {
   private static final Logger b = LogUtils.getLogger();
   private final File c;
   protected final DataFixer a;
   private static final DateTimeFormatter d = eps.a();

   public eqa(epx.c $$0, DataFixer $$1) {
      this.a = $$1;
      this.c = $$0.a(epv.c).toFile();
      this.c.mkdirs();
   }

   public void a(cmy $$0) {
      try {
         us $$1 = $$0.f(new us());
         Path $$2 = this.c.toPath();
         Path $$3 = Files.createTempFile($$2, $$0.cA() + "-", ".dat");
         vf.a($$1, $$3);
         Path $$4 = $$2.resolve($$0.cA() + ".dat");
         Path $$5 = $$2.resolve($$0.cA() + ".dat_old");
         ac.a($$4, $$3, $$5);
      } catch (Exception var7) {
         b.warn("Failed to save player data for {}", $$0.af().getString());
      }
   }

   private void a(cmy $$0, String $$1) {
      Path $$2 = this.c.toPath();
      Path $$3 = $$2.resolve($$0.cA() + $$1);
      Path $$4 = $$2.resolve($$0.cA() + "_corrupted_" + LocalDateTime.now().format(d) + $$1);
      if (Files.isRegularFile($$3)) {
         try {
            Files.copy($$3, $$4, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
         } catch (Exception var7) {
            b.warn("Failed to copy the player.dat file for {}", $$0.af().getString(), var7);
         }
      }
   }

   private Optional<us> b(cmy $$0, String $$1) {
      File $$2 = new File(this.c, $$0.cA() + $$1);
      if ($$2.exists() && $$2.isFile()) {
         try {
            return Optional.of(vf.a($$2.toPath(), vb.a()));
         } catch (Exception var5) {
            b.warn("Failed to load player data for {}", $$0.af().getString());
         }
      }

      return Optional.empty();
   }

   public Optional<us> b(cmy $$0) {
      Optional<us> $$1 = this.b($$0, ".dat");
      if ($$1.isEmpty()) {
         this.a($$0, ".dat");
      }

      return $$1.or(() -> this.b($$0, ".dat_old")).map($$1x -> {
         int $$2 = vh.b($$1x, -1);
         $$1x = bag.b.a(this.a, $$1x, $$2);
         $$0.g($$1x);
         return $$1x;
      });
   }
}
