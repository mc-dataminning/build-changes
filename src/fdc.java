import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fdc extends eym {
   private static final Logger a = LogUtils.getLogger();
   private static final tn b = tn.c("selectWorld.enterName");
   private ess c;
   private final BooleanConsumer k;
   private etb l;
   private final eci.c m;

   public fdc(BooleanConsumer $$0, eci.c $$1) {
      super(tn.c("selectWorld.edit.title"));
      this.k = $$0;
      this.m = $$1;
   }

   @Override
   protected void aH_() {
      this.c = ess.a(tn.c("selectWorld.edit.save"), $$0x -> this.l()).a(this.g / 2 - 100, this.h / 4 + 144 + 5, 98, 20).a();
      this.l = new etb(this.i, this.g / 2 - 100, 38, 200, 20, tn.c("selectWorld.enterName"));
      ecj $$0 = this.m.d();
      String $$1 = $$0 == null ? "" : $$0.b();
      this.l.a($$1);
      this.l.b($$0x -> this.c.i = !ac.b($$0x));
      this.e(this.l);
      ess $$2 = this.d(ess.a(tn.c("selectWorld.edit.resetIcon"), $$0x -> {
         this.m.f().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$0x.i = false;
      }).a(this.g / 2 - 100, this.h / 4 + 0 + 5, 200, 20).a());
      this.d(ess.a(tn.c("selectWorld.edit.openFolder"), $$0x -> ac.i().a(this.m.a(ecg.l).toFile())).a(this.g / 2 - 100, this.h / 4 + 24 + 5, 200, 20).a());
      this.d(ess.a(tn.c("selectWorld.edit.backup"), $$0x -> {
         boolean $$1x = a(this.m);
         this.k.accept(!$$1x);
      }).a(this.g / 2 - 100, this.h / 4 + 48 + 5, 200, 20).a());
      this.d(ess.a(tn.c("selectWorld.edit.backupFolder"), $$0x -> {
         eci $$1x = this.f.l();
         Path $$2x = $$1x.d();

         try {
            v.c($$2x);
         } catch (IOException var5) {
            throw new RuntimeException(var5);
         }

         ac.i().a($$2x.toFile());
      }).a(this.g / 2 - 100, this.h / 4 + 72 + 5, 200, 20).a());
      this.d(ess.a(tn.c("selectWorld.edit.optimize"), $$0x -> this.f.a(new exa(this, ($$0xx, $$1x) -> {
            if ($$0xx) {
               a(this.m);
            }

            this.f.a(fde.a(this.f, this.k, this.f.ar(), this.m, $$1x));
         }, tn.c("optimizeWorld.confirm.title"), tn.c("optimizeWorld.confirm.description"), true))).a(this.g / 2 - 100, this.h / 4 + 96 + 5, 200, 20).a());
      this.d(this.c);
      this.d(ess.a(tm.e, $$0x -> this.k.accept(false)).a(this.g / 2 + 2, this.h / 4 + 144 + 5, 98, 20).a());
      $$2.i = this.m.f().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.c(this.l);
   }

   @Override
   public void a(eqx $$0, int $$1, int $$2) {
      String $$3 = this.l.a();
      this.b($$0, $$1, $$2);
      this.l.a($$3);
   }

   @Override
   public void az_() {
      this.k.accept(false);
   }

   private void l() {
      try {
         this.m.a(this.l.a().trim());
         this.k.accept(true);
      } catch (IOException var2) {
         a.error("Failed to access world '{}'", this.m.b(), var2);
         euy.a(this.f, this.m.b());
         this.k.accept(true);
      }
   }

   public static void a(eci $$0, String $$1) {
      boolean $$2 = false;

      try (eci.c $$3 = $$0.c($$1)) {
         $$2 = true;
         a($$3);
      } catch (IOException var8) {
         if (!$$2) {
            euy.a(eqx.O(), $$1);
         }

         a.warn("Failed to create backup of level {}", $$1, var8);
      } catch (ehe var9) {
         a.warn("{}", var9.getMessage());
         euy.a(eqx.O(), $$1);
      }
   }

   public static boolean a(eci.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.h();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         tn $$4 = tn.c("selectWorld.edit.backupFailed");
         tn $$5 = tn.b($$2.getMessage());
         eqx.O().ay().a(new euy(euy.a.c, $$4, $$5));
         return false;
      } else {
         tn $$6 = tn.a("selectWorld.edit.backupCreated", $$0.b());
         tn $$7 = tn.a("selectWorld.edit.backupSize", ary.c((double)$$1 / 1048576.0));
         eqx.O().ay().a(new euy(euy.a.c, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
      $$0.b(this.i, b, this.g / 2 - 100 + 1, 24, 10526880);
      this.l.a($$0, $$1, $$2, $$3);
   }
}
