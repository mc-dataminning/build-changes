import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fie extends fdm {
   private static final Logger a = LogUtils.getLogger();
   private static final vg b = vg.c("selectWorld.enterName").a(n.h);
   private static final vg c = vg.c("selectWorld.edit.resetIcon");
   private static final vg k = vg.c("selectWorld.edit.openFolder");
   private static final vg l = vg.c("selectWorld.edit.backup");
   private static final vg m = vg.c("selectWorld.edit.backupFolder");
   private static final vg n = vg.c("selectWorld.edit.optimize");
   private static final vg o = vg.c("optimizeWorld.confirm.title");
   private static final vg p = vg.c("optimizeWorld.confirm.description");
   private static final vg q = vg.c("selectWorld.edit.save");
   private static final int r = 200;
   private static final int t = 4;
   private static final int u = 98;
   private final fbf v = fbf.d().a(5);
   private final BooleanConsumer w;
   private final egv.c x;

   public static fie a(evr $$0, egv.c $$1, BooleanConsumer $$2) throws IOException {
      egw $$3 = $$1.a($$1.f());
      return new fie($$0, $$1, $$3.b(), $$2);
   }

   private fie(evr $$0, egv.c $$1, String $$2, BooleanConsumer $$3) {
      super(vg.c("selectWorld.edit.title"));
      this.w = $$3;
      this.x = $$1;
      exc $$4 = $$0.h;
      this.v.a(new fbg(200, 20));
      this.v.a(new eyy(b, $$4));
      eya $$5 = this.v.a(new eya($$4, 200, 20, b));
      $$5.a($$2);
      fbf $$6 = fbf.e().a(4);
      exr $$7 = $$6.a(exr.a(q, $$1x -> this.a($$5.a())).a(98).a());
      $$6.a(exr.a(vf.e, $$0x -> this.d()).a(98).a());
      $$5.b($$1x -> $$7.j = !ac.b($$1x));
      this.v.a(exr.a(c, $$1x -> {
         $$1.h().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.h().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.v.a(exr.a(k, $$1x -> ac.j().a($$1.a(egt.l).toFile())).a(200).a());
      this.v.a(exr.a(l, $$1x -> {
         boolean $$2x = a($$1);
         this.w.accept(!$$2x);
      }).a(200).a());
      this.v.a(exr.a(m, $$1x -> {
         egv $$2x = $$0.l();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.j().a($$3x.toFile());
      }).a(200).a());
      this.v.a(exr.a(n, $$2x -> $$0.a(new fca(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fig.a($$0, this.w, $$0.ar(), $$1, $$3x));
         }, o, p, true))).a(200).a());
      this.v.a(new fbg(200, 20));
      this.v.a($$6);
      this.c($$5);
      this.v.a($$1x -> {
         exp var10000 = this.d($$1x);
      });
   }

   @Override
   protected void aP_() {
      this.c();
   }

   @Override
   protected void c() {
      this.v.a();
      faz.a(this.v, this.F());
   }

   @Override
   public void d() {
      this.w.accept(false);
   }

   private void a(String $$0) {
      try {
         this.x.a($$0);
      } catch (sz | tf | IOException var3) {
         a.error("Failed to access world '{}'", this.x.d(), var3);
         ezy.a(this.f, this.x.d());
      }

      this.w.accept(true);
   }

   public static boolean a(egv.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.j();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         vg $$4 = vg.c("selectWorld.edit.backupFailed");
         vg $$5 = vg.b($$2.getMessage());
         evr.O().ay().a(new ezy(ezy.a.b, $$4, $$5));
         return false;
      } else {
         vg $$6 = vg.a("selectWorld.edit.backupCreated", $$0.d());
         vg $$7 = vg.a("selectWorld.edit.backupSize", aup.c((double)$$1 / 1048576.0));
         evr.O().ay().a(new ezy(ezy.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
