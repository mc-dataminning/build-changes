import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fhs extends fda {
   private static final Logger a = LogUtils.getLogger();
   private static final vf b = vf.c("selectWorld.enterName").a(n.h);
   private static final vf c = vf.c("selectWorld.edit.resetIcon");
   private static final vf k = vf.c("selectWorld.edit.openFolder");
   private static final vf l = vf.c("selectWorld.edit.backup");
   private static final vf m = vf.c("selectWorld.edit.backupFolder");
   private static final vf n = vf.c("selectWorld.edit.optimize");
   private static final vf o = vf.c("optimizeWorld.confirm.title");
   private static final vf p = vf.c("optimizeWorld.confirm.description");
   private static final vf q = vf.c("selectWorld.edit.save");
   private static final int r = 200;
   private static final int t = 4;
   private static final int u = 98;
   private final fat v = fat.d().a(5);
   private final BooleanConsumer w;
   private final egl.c x;

   public static fhs a(evh $$0, egl.c $$1, BooleanConsumer $$2) throws IOException {
      egm $$3 = $$1.a($$1.f());
      return new fhs($$0, $$1, $$3.b(), $$2);
   }

   private fhs(evh $$0, egl.c $$1, String $$2, BooleanConsumer $$3) {
      super(vf.c("selectWorld.edit.title"));
      this.w = $$3;
      this.x = $$1;
      ewr $$4 = $$0.h;
      this.v.a(new fau(200, 20));
      this.v.a(new eym(b, $$4));
      exo $$5 = this.v.a(new exo($$4, 200, 20, b));
      $$5.a($$2);
      fat $$6 = fat.e().a(4);
      exf $$7 = $$6.a(exf.a(q, $$1x -> this.a($$5.a())).a(98).a());
      $$6.a(exf.a(ve.e, $$0x -> this.aE_()).a(98).a());
      $$5.b($$1x -> $$7.j = !ac.b($$1x));
      this.v.a(exf.a(c, $$1x -> {
         $$1.h().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.h().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.v.a(exf.a(k, $$1x -> ac.j().a($$1.a(egj.l).toFile())).a(200).a());
      this.v.a(exf.a(l, $$1x -> {
         boolean $$2x = a($$1);
         this.w.accept(!$$2x);
      }).a(200).a());
      this.v.a(exf.a(m, $$1x -> {
         egl $$2x = $$0.l();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.j().a($$3x.toFile());
      }).a(200).a());
      this.v.a(exf.a(n, $$2x -> $$0.a(new fbo(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fhu.a($$0, this.w, $$0.ar(), $$1, $$3x));
         }, o, p, true))).a(200).a());
      this.v.a(new fau(200, 20));
      this.v.a($$6);
      this.c($$5);
      this.v.a($$1x -> {
         exd var10000 = this.d($$1x);
      });
   }

   @Override
   protected void aN_() {
      this.c();
   }

   @Override
   protected void c() {
      this.v.a();
      fan.a(this.v, this.F());
   }

   @Override
   public void aE_() {
      this.w.accept(false);
   }

   private void a(String $$0) {
      try {
         this.x.a($$0);
      } catch (sy | te | IOException var3) {
         a.error("Failed to access world '{}'", this.x.d(), var3);
         ezm.a(this.f, this.x.d());
      }

      this.w.accept(true);
   }

   public static boolean a(egl.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.j();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         vf $$4 = vf.c("selectWorld.edit.backupFailed");
         vf $$5 = vf.b($$2.getMessage());
         evh.O().ay().a(new ezm(ezm.a.b, $$4, $$5));
         return false;
      } else {
         vf $$6 = vf.a("selectWorld.edit.backupCreated", $$0.d());
         vf $$7 = vf.a("selectWorld.edit.backupSize", aun.c((double)$$1 / 1048576.0));
         evh.O().ay().a(new ezm(ezm.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
