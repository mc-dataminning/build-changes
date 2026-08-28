import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fsy extends fnx {
   private static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("selectWorld.enterName").a(n.h);
   private static final wy c = wy.c("selectWorld.edit.resetIcon");
   private static final wy q = wy.c("selectWorld.edit.openFolder");
   private static final wy r = wy.c("selectWorld.edit.backup");
   private static final wy s = wy.c("selectWorld.edit.backupFolder");
   private static final wy u = wy.c("selectWorld.edit.optimize");
   private static final wy v = wy.c("optimizeWorld.confirm.title");
   private static final wy w = wy.c("optimizeWorld.confirm.description");
   private static final wy x = wy.c("selectWorld.edit.save");
   private static final int y = 200;
   private static final int z = 4;
   private static final int A = 98;
   private final flx B = flx.d().a(5);
   private final BooleanConsumer C;
   private final eqz.c D;
   private final fip E;

   public static fsy a(fgi $$0, eqz.c $$1, BooleanConsumer $$2) throws IOException {
      era $$3 = $$1.a($$1.h());
      return new fsy($$0, $$1, $$3.b(), $$2);
   }

   private fsy(fgi $$0, eqz.c $$1, String $$2, BooleanConsumer $$3) {
      super(wy.c("selectWorld.edit.title"));
      this.C = $$3;
      this.D = $$1;
      fhr $$4 = $$0.h;
      this.B.a(new fly(200, 20));
      this.B.a(new fjn(b, $$4));
      this.E = this.B.a(new fip($$4, 200, 20, b));
      this.E.a($$2);
      flx $$5 = flx.e().a(4);
      fig $$6 = $$5.a(fig.a(x, $$0x -> this.a(this.E.a())).a(98).a());
      $$5.a(fig.a(wx.e, $$0x -> this.d()).a(98).a());
      this.E.b($$1x -> $$6.j = !azk.h($$1x));
      this.B.a(fig.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.B.a(fig.a(q, $$1x -> ad.k().a($$1.a(eqx.l).toFile())).a(200).a());
      this.B.a(fig.a(r, $$1x -> {
         boolean $$2x = a($$1);
         this.C.accept(!$$2x);
      }).a(200).a());
      this.B.a(fig.a(s, $$1x -> {
         eqz $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ad.k().a($$3x.toFile());
      }).a(200).a());
      this.B.a(fig.a(u, $$2x -> $$0.a(new fmr(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fta.a($$0, this.C, $$0.as(), $$1, $$3x));
         }, v, w, true))).a(200).a());
      this.B.a(new fly(200, 20));
      this.B.a($$5);
      this.B.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aE_() {
      this.b(this.E);
   }

   @Override
   protected void aP_() {
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      flr.a(this.B, this.H());
   }

   @Override
   public void d() {
      this.C.accept(false);
   }

   private void a(String $$0) {
      try {
         this.D.a($$0);
      } catch (ul | ur | IOException var3) {
         a.error("Failed to access world '{}'", this.D.f(), var3);
         fko.a(this.l, this.D.f());
      }

      this.C.accept(true);
   }

   public static boolean a(eqz.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         wy $$4 = wy.c("selectWorld.edit.backupFailed");
         wy $$5 = wy.b($$2.getMessage());
         fgi.Q().aw().a(new fko(fko.a.b, $$4, $$5));
         return false;
      } else {
         wy $$6 = wy.a("selectWorld.edit.backupCreated", $$0.f());
         wy $$7 = wy.a("selectWorld.edit.backupSize", ayn.c((double)$$1 / 1048576.0));
         fgi.Q().aw().a(new fko(fko.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 15, 16777215);
   }
}
