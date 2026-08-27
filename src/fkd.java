import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fkd extends ffl {
   private static final Logger a = LogUtils.getLogger();
   private static final vq b = vq.c("selectWorld.enterName").a(n.h);
   private static final vq c = vq.c("selectWorld.edit.resetIcon");
   private static final vq k = vq.c("selectWorld.edit.openFolder");
   private static final vq l = vq.c("selectWorld.edit.backup");
   private static final vq m = vq.c("selectWorld.edit.backupFolder");
   private static final vq n = vq.c("selectWorld.edit.optimize");
   private static final vq o = vq.c("optimizeWorld.confirm.title");
   private static final vq p = vq.c("optimizeWorld.confirm.description");
   private static final vq q = vq.c("selectWorld.edit.save");
   private static final int r = 200;
   private static final int t = 4;
   private static final int u = 98;
   private final fde v = fde.d().a(5);
   private final BooleanConsumer w;
   private final eis.c x;
   private final ezx y;

   public static fkd a(exo $$0, eis.c $$1, BooleanConsumer $$2) throws IOException {
      eit $$3 = $$1.a($$1.f());
      return new fkd($$0, $$1, $$3.b(), $$2);
   }

   private fkd(exo $$0, eis.c $$1, String $$2, BooleanConsumer $$3) {
      super(vq.c("selectWorld.edit.title"));
      this.w = $$3;
      this.x = $$1;
      eyz $$4 = $$0.h;
      this.v.a(new fdf(200, 20));
      this.v.a(new fav(b, $$4));
      this.y = this.v.a(new ezx($$4, 200, 20, b));
      this.y.a($$2);
      fde $$5 = fde.e().a(4);
      ezo $$6 = $$5.a(ezo.a(q, $$0x -> this.a(this.y.a())).a(98).a());
      $$5.a(ezo.a(vp.e, $$0x -> this.d()).a(98).a());
      this.y.b($$1x -> $$6.j = !ac.b($$1x));
      this.v.a(ezo.a(c, $$1x -> {
         $$1.h().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.h().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.v.a(ezo.a(k, $$1x -> ac.j().a($$1.a(eiq.l).toFile())).a(200).a());
      this.v.a(ezo.a(l, $$1x -> {
         boolean $$2x = a($$1);
         this.w.accept(!$$2x);
      }).a(200).a());
      this.v.a(ezo.a(m, $$1x -> {
         eis $$2x = $$0.l();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.j().a($$3x.toFile());
      }).a(200).a());
      this.v.a(ezo.a(n, $$2x -> $$0.a(new fdz(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fkf.a($$0, this.w, $$0.as(), $$1, $$3x));
         }, o, p, true))).a(200).a());
      this.v.a(new fdf(200, 20));
      this.v.a($$5);
      this.v.a($$1x -> {
         ezm var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aH_() {
      this.b(this.y);
   }

   @Override
   protected void aQ_() {
      this.c();
   }

   @Override
   protected void c() {
      this.v.a();
      fcy.a(this.v, this.F());
   }

   @Override
   public void d() {
      this.w.accept(false);
   }

   private void a(String $$0) {
      try {
         this.x.a($$0);
      } catch (th | tn | IOException var3) {
         a.error("Failed to access world '{}'", this.x.d(), var3);
         fbw.a(this.f, this.x.d());
      }

      this.w.accept(true);
   }

   public static boolean a(eis.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.j();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         vq $$4 = vq.c("selectWorld.edit.backupFailed");
         vq $$5 = vq.b($$2.getMessage());
         exo.P().az().a(new fbw(fbw.a.b, $$4, $$5));
         return false;
      } else {
         vq $$6 = vq.a("selectWorld.edit.backupCreated", $$0.d());
         vq $$7 = vq.a("selectWorld.edit.backupSize", awi.c((double)$$1 / 1048576.0));
         exo.P().az().a(new fbw(fbw.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
