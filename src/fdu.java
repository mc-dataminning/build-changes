import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fdu extends ezd {
   private static final Logger a = LogUtils.getLogger();
   private static final ui b = ui.c("selectWorld.enterName");
   private etj c;
   private final BooleanConsumer k;
   private ets l;
   private final ecy.c m;

   public fdu(BooleanConsumer $$0, ecy.c $$1) {
      super(ui.c("selectWorld.edit.title"));
      this.k = $$0;
      this.m = $$1;
   }

   @Override
   protected void aM_() {
      this.c = etj.a(ui.c("selectWorld.edit.save"), $$0x -> this.l()).a(this.g / 2 - 100, this.h / 4 + 144 + 5, 98, 20).a();
      this.l = new ets(this.i, this.g / 2 - 100, 38, 200, 20, ui.c("selectWorld.enterName"));
      ecz $$0 = this.m.d();
      String $$1 = $$0 == null ? "" : $$0.b();
      this.l.a($$1);
      this.l.b($$0x -> this.c.i = !ac.b($$0x));
      this.e(this.l);
      etj $$2 = this.d(etj.a(ui.c("selectWorld.edit.resetIcon"), $$0x -> {
         this.m.f().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$0x.i = false;
      }).a(this.g / 2 - 100, this.h / 4 + 0 + 5, 200, 20).a());
      this.d(etj.a(ui.c("selectWorld.edit.openFolder"), $$0x -> ac.i().a(this.m.a(ecw.l).toFile())).a(this.g / 2 - 100, this.h / 4 + 24 + 5, 200, 20).a());
      this.d(etj.a(ui.c("selectWorld.edit.backup"), $$0x -> {
         boolean $$1x = a(this.m);
         this.k.accept(!$$1x);
      }).a(this.g / 2 - 100, this.h / 4 + 48 + 5, 200, 20).a());
      this.d(etj.a(ui.c("selectWorld.edit.backupFolder"), $$0x -> {
         ecy $$1x = this.f.l();
         Path $$2x = $$1x.d();

         try {
            v.c($$2x);
         } catch (IOException var5) {
            throw new RuntimeException(var5);
         }

         ac.i().a($$2x.toFile());
      }).a(this.g / 2 - 100, this.h / 4 + 72 + 5, 200, 20).a());
      this.d(etj.a(ui.c("selectWorld.edit.optimize"), $$0x -> this.f.a(new exs(this, ($$0xx, $$1x) -> {
            if ($$0xx) {
               a(this.m);
            }

            this.f.a(fdw.a(this.f, this.k, this.f.ar(), this.m, $$1x));
         }, ui.c("optimizeWorld.confirm.title"), ui.c("optimizeWorld.confirm.description"), true))).a(this.g / 2 - 100, this.h / 4 + 96 + 5, 200, 20).a());
      this.d(this.c);
      this.d(etj.a(uh.e, $$0x -> this.k.accept(false)).a(this.g / 2 + 2, this.h / 4 + 144 + 5, 98, 20).a());
      $$2.i = this.m.f().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.c(this.l);
   }

   @Override
   public void a(ero $$0, int $$1, int $$2) {
      String $$3 = this.l.a();
      this.b($$0, $$1, $$2);
      this.l.a($$3);
   }

   @Override
   public void aC_() {
      this.k.accept(false);
   }

   private void l() {
      try {
         this.m.a(this.l.a().trim());
         this.k.accept(true);
      } catch (IOException var2) {
         a.error("Failed to access world '{}'", this.m.b(), var2);
         evq.a(this.f, this.m.b());
         this.k.accept(true);
      }
   }

   public static void a(ecy $$0, String $$1) {
      boolean $$2 = false;

      try (ecy.c $$3 = $$0.d($$1)) {
         $$2 = true;
         a($$3);
      } catch (IOException var8) {
         if (!$$2) {
            evq.a(ero.O(), $$1);
         }

         a.warn("Failed to create backup of level {}", $$1, var8);
      } catch (ehu var9) {
         a.warn("{}", var9.getMessage());
         evq.a(ero.O(), $$1);
      }
   }

   public static boolean a(ecy.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.h();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         ui $$4 = ui.c("selectWorld.edit.backupFailed");
         ui $$5 = ui.b($$2.getMessage());
         ero.O().ay().a(new evq(evq.a.c, $$4, $$5));
         return false;
      } else {
         ui $$6 = ui.a("selectWorld.edit.backupCreated", $$0.b());
         ui $$7 = ui.a("selectWorld.edit.backupSize", asy.c((double)$$1 / 1048576.0));
         ero.O().ay().a(new evq(evq.a.c, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
      $$0.b(this.i, b, this.g / 2 - 100 + 1, 24, 10526880);
      this.l.a($$0, $$1, $$2, $$3);
   }
}
