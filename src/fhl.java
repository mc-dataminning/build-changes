import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fhl extends fct {
   private static final Logger a = LogUtils.getLogger();
   private static final vd b = vd.c("selectWorld.enterName").a(n.h);
   private static final vd c = vd.c("selectWorld.edit.resetIcon");
   private static final vd k = vd.c("selectWorld.edit.openFolder");
   private static final vd l = vd.c("selectWorld.edit.backup");
   private static final vd m = vd.c("selectWorld.edit.backupFolder");
   private static final vd n = vd.c("selectWorld.edit.optimize");
   private static final vd o = vd.c("optimizeWorld.confirm.title");
   private static final vd p = vd.c("optimizeWorld.confirm.description");
   private static final vd q = vd.c("selectWorld.edit.save");
   private static final int r = 200;
   private static final int t = 4;
   private static final int u = 98;
   private final fam v = fam.d().a(5);
   private final BooleanConsumer w;
   private final egf.c x;

   public static fhl a(eva $$0, egf.c $$1, BooleanConsumer $$2) throws IOException {
      egg $$3 = $$1.a($$1.f());
      return new fhl($$0, $$1, $$3.b(), $$2);
   }

   private fhl(eva $$0, egf.c $$1, String $$2, BooleanConsumer $$3) {
      super(vd.c("selectWorld.edit.title"));
      this.w = $$3;
      this.x = $$1;
      ewk $$4 = $$0.h;
      this.v.a(new fan(200, 20));
      this.v.a(new eyf(b, $$4));
      exh $$5 = this.v.a(new exh($$4, 200, 20, b));
      $$5.a($$2);
      fam $$6 = fam.e().a(4);
      ewy $$7 = $$6.a(ewy.a(q, $$1x -> this.a($$5.a())).a(98).a());
      $$6.a(ewy.a(vc.e, $$0x -> this.aE_()).a(98).a());
      $$5.b($$1x -> $$7.j = !ac.b($$1x));
      this.v.a(ewy.a(c, $$1x -> {
         $$1.h().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.h().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.v.a(ewy.a(k, $$1x -> ac.i().a($$1.a(egd.l).toFile())).a(200).a());
      this.v.a(ewy.a(l, $$1x -> {
         boolean $$2x = a($$1);
         this.w.accept(!$$2x);
      }).a(200).a());
      this.v.a(ewy.a(m, $$1x -> {
         egf $$2x = $$0.l();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.i().a($$3x.toFile());
      }).a(200).a());
      this.v.a(ewy.a(n, $$2x -> $$0.a(new fbh(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fhn.a($$0, this.w, $$0.aq(), $$1, $$3x));
         }, o, p, true))).a(200).a());
      this.v.a(new fan(200, 20));
      this.v.a($$6);
      this.c($$5);
      this.v.a($$1x -> {
         eww var10000 = this.d($$1x);
      });
   }

   @Override
   protected void aN_() {
      this.c();
   }

   @Override
   protected void c() {
      this.v.a();
      fag.a(this.v, this.F());
   }

   @Override
   public void aE_() {
      this.w.accept(false);
   }

   private void a(String $$0) {
      try {
         this.x.a($$0);
      } catch (sw | tc | IOException var3) {
         a.error("Failed to access world '{}'", this.x.d(), var3);
         ezf.a(this.f, this.x.d());
      }

      this.w.accept(true);
   }

   public static boolean a(egf.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.j();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         vd $$4 = vd.c("selectWorld.edit.backupFailed");
         vd $$5 = vd.b($$2.getMessage());
         eva.N().ax().a(new ezf(ezf.a.c, $$4, $$5));
         return false;
      } else {
         vd $$6 = vd.a("selectWorld.edit.backupCreated", $$0.d());
         vd $$7 = vd.a("selectWorld.edit.backupSize", aui.c((double)$$1 / 1048576.0));
         eva.N().ax().a(new ezf(ezf.a.c, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
