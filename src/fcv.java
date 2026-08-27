import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fcv extends eye {
   private static final Logger a = LogUtils.getLogger();
   private static final tl b = tl.c("selectWorld.enterName");
   private esk c;
   private final BooleanConsumer k;
   private est l;
   private final eca.c m;

   public fcv(BooleanConsumer $$0, eca.c $$1) {
      super(tl.c("selectWorld.edit.title"));
      this.k = $$0;
      this.m = $$1;
   }

   @Override
   protected void aH_() {
      this.c = esk.a(tl.c("selectWorld.edit.save"), $$0x -> this.l()).a(this.g / 2 - 100, this.h / 4 + 144 + 5, 98, 20).a();
      this.l = new est(this.i, this.g / 2 - 100, 38, 200, 20, tl.c("selectWorld.enterName"));
      ecb $$0 = this.m.d();
      String $$1 = $$0 == null ? "" : $$0.b();
      this.l.a($$1);
      this.l.b($$0x -> this.c.i = !ac.b($$0x));
      this.e(this.l);
      esk $$2 = this.d(esk.a(tl.c("selectWorld.edit.resetIcon"), $$0x -> {
         this.m.f().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$0x.i = false;
      }).a(this.g / 2 - 100, this.h / 4 + 0 + 5, 200, 20).a());
      this.d(esk.a(tl.c("selectWorld.edit.openFolder"), $$0x -> ac.i().a(this.m.a(eby.l).toFile())).a(this.g / 2 - 100, this.h / 4 + 24 + 5, 200, 20).a());
      this.d(esk.a(tl.c("selectWorld.edit.backup"), $$0x -> {
         boolean $$1x = a(this.m);
         this.k.accept(!$$1x);
      }).a(this.g / 2 - 100, this.h / 4 + 48 + 5, 200, 20).a());
      this.d(esk.a(tl.c("selectWorld.edit.backupFolder"), $$0x -> {
         eca $$1x = this.f.l();
         Path $$2x = $$1x.d();

         try {
            v.c($$2x);
         } catch (IOException var5) {
            throw new RuntimeException(var5);
         }

         ac.i().a($$2x.toFile());
      }).a(this.g / 2 - 100, this.h / 4 + 72 + 5, 200, 20).a());
      this.d(esk.a(tl.c("selectWorld.edit.optimize"), $$0x -> this.f.a(new ewt(this, ($$0xx, $$1x) -> {
            if ($$0xx) {
               a(this.m);
            }

            this.f.a(fcx.a(this.f, this.k, this.f.ar(), this.m, $$1x));
         }, tl.c("optimizeWorld.confirm.title"), tl.c("optimizeWorld.confirm.description"), true))).a(this.g / 2 - 100, this.h / 4 + 96 + 5, 200, 20).a());
      this.d(this.c);
      this.d(esk.a(tk.e, $$0x -> this.k.accept(false)).a(this.g / 2 + 2, this.h / 4 + 144 + 5, 98, 20).a());
      $$2.i = this.m.f().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.c(this.l);
   }

   @Override
   public void a(eqp $$0, int $$1, int $$2) {
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
         eur.a(this.f, this.m.b());
         this.k.accept(true);
      }
   }

   public static void a(eca $$0, String $$1) {
      boolean $$2 = false;

      try (eca.c $$3 = $$0.d($$1)) {
         $$2 = true;
         a($$3);
      } catch (IOException var8) {
         if (!$$2) {
            eur.a(eqp.O(), $$1);
         }

         a.warn("Failed to create backup of level {}", $$1, var8);
      } catch (egw var9) {
         a.warn("{}", var9.getMessage());
         eur.a(eqp.O(), $$1);
      }
   }

   public static boolean a(eca.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.h();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         tl $$4 = tl.c("selectWorld.edit.backupFailed");
         tl $$5 = tl.b($$2.getMessage());
         eqp.O().ay().a(new eur(eur.a.c, $$4, $$5));
         return false;
      } else {
         tl $$6 = tl.a("selectWorld.edit.backupCreated", $$0.b());
         tl $$7 = tl.a("selectWorld.edit.backupSize", asb.c((double)$$1 / 1048576.0));
         eqp.O().ay().a(new eur(eur.a.c, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
      $$0.b(this.i, b, this.g / 2 - 100 + 1, 24, 10526880);
      this.l.a($$0, $$1, $$2, $$3);
   }
}
