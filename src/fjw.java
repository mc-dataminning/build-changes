import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fjw extends ffe {
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
   private final fcx v = fcx.d().a(5);
   private final BooleanConsumer w;
   private final eil.c x;
   private final ezq y;

   public static fjw a(exh $$0, eil.c $$1, BooleanConsumer $$2) throws IOException {
      eim $$3 = $$1.a($$1.f());
      return new fjw($$0, $$1, $$3.b(), $$2);
   }

   private fjw(exh $$0, eil.c $$1, String $$2, BooleanConsumer $$3) {
      super(vq.c("selectWorld.edit.title"));
      this.w = $$3;
      this.x = $$1;
      eys $$4 = $$0.h;
      this.v.a(new fcy(200, 20));
      this.v.a(new fao(b, $$4));
      this.y = this.v.a(new ezq($$4, 200, 20, b));
      this.y.a($$2);
      fcx $$5 = fcx.e().a(4);
      ezh $$6 = $$5.a(ezh.a(q, $$0x -> this.a(this.y.a())).a(98).a());
      $$5.a(ezh.a(vp.e, $$0x -> this.d()).a(98).a());
      this.y.b($$1x -> $$6.j = !ac.b($$1x));
      this.v.a(ezh.a(c, $$1x -> {
         $$1.h().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.h().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.v.a(ezh.a(k, $$1x -> ac.j().a($$1.a(eij.l).toFile())).a(200).a());
      this.v.a(ezh.a(l, $$1x -> {
         boolean $$2x = a($$1);
         this.w.accept(!$$2x);
      }).a(200).a());
      this.v.a(ezh.a(m, $$1x -> {
         eil $$2x = $$0.l();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.j().a($$3x.toFile());
      }).a(200).a());
      this.v.a(ezh.a(n, $$2x -> $$0.a(new fds(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fjy.a($$0, this.w, $$0.ar(), $$1, $$3x));
         }, o, p, true))).a(200).a());
      this.v.a(new fcy(200, 20));
      this.v.a($$5);
      this.v.a($$1x -> {
         ezf var10000 = this.d($$1x);
      });
   }

   @Override
   protected void aH_() {
      this.c(this.y);
   }

   @Override
   protected void aQ_() {
      this.c();
   }

   @Override
   protected void c() {
      this.v.a();
      fcr.a(this.v, this.F());
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
         fbp.a(this.f, this.x.d());
      }

      this.w.accept(true);
   }

   public static boolean a(eil.c $$0) {
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
         exh.O().ay().a(new fbp(fbp.a.b, $$4, $$5));
         return false;
      } else {
         vq $$6 = vq.a("selectWorld.edit.backupCreated", $$0.d());
         vq $$7 = vq.a("selectWorld.edit.backupSize", awh.c((double)$$1 / 1048576.0));
         exh.O().ay().a(new fbp(fbp.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
