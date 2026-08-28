import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class frp extends fmy {
   private static final Logger a = LogUtils.getLogger();
   private static final xl b = xl.c("selectWorld.enterName").a(n.h);
   private static final xl c = xl.c("selectWorld.edit.resetIcon");
   private static final xl d = xl.c("selectWorld.edit.openFolder");
   private static final xl r = xl.c("selectWorld.edit.backup");
   private static final xl s = xl.c("selectWorld.edit.backupFolder");
   private static final xl u = xl.c("selectWorld.edit.optimize");
   private static final xl v = xl.c("optimizeWorld.confirm.title");
   private static final xl w = xl.c("optimizeWorld.confirm.description");
   private static final xl x = xl.c("selectWorld.edit.save");
   private static final int y = 200;
   private static final int z = 4;
   private static final int A = 98;
   private final fkq B = fkq.d().a(5);
   private final BooleanConsumer C;
   private final epr.c D;
   private final fhi E;

   public static frp a(ffa $$0, epr.c $$1, BooleanConsumer $$2) throws IOException {
      eps $$3 = $$1.a($$1.h());
      return new frp($$0, $$1, $$3.b(), $$2);
   }

   private frp(ffa $$0, epr.c $$1, String $$2, BooleanConsumer $$3) {
      super(xl.c("selectWorld.edit.title"));
      this.C = $$3;
      this.D = $$1;
      fgk $$4 = $$0.h;
      this.B.a(new fkr(200, 20));
      this.B.a(new fig(b, $$4));
      this.E = this.B.a(new fhi($$4, 200, 20, b));
      this.E.a($$2);
      fkq $$5 = fkq.e().a(4);
      fgz $$6 = $$5.a(fgz.a(x, $$0x -> this.a(this.E.a())).a(98).a());
      $$5.a(fgz.a(xk.e, $$0x -> this.d()).a(98).a());
      this.E.b($$1x -> $$6.j = !azq.h($$1x));
      this.B.a(fgz.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.B.a(fgz.a(d, $$1x -> ac.k().a($$1.a(epp.l).toFile())).a(200).a());
      this.B.a(fgz.a(r, $$1x -> {
         boolean $$2x = a($$1);
         this.C.accept(!$$2x);
      }).a(200).a());
      this.B.a(fgz.a(s, $$1x -> {
         epr $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.k().a($$3x.toFile());
      }).a(200).a());
      this.B.a(fgz.a(u, $$2x -> $$0.a(new fll(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(frr.a($$0, this.C, $$0.as(), $$1, $$3x));
         }, v, w, true))).a(200).a());
      this.B.a(new fkr(200, 20));
      this.B.a($$5);
      this.B.a($$1x -> {
         fgx var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aD_() {
      this.b(this.E);
   }

   @Override
   protected void aN_() {
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      fkk.a(this.B, this.G());
   }

   @Override
   public void d() {
      this.C.accept(false);
   }

   private void a(String $$0) {
      try {
         this.D.a($$0);
      } catch (vc | vi | IOException var3) {
         a.error("Failed to access world '{}'", this.D.f(), var3);
         fjh.a(this.m, this.D.f());
      }

      this.C.accept(true);
   }

   public static boolean a(epr.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xl $$4 = xl.c("selectWorld.edit.backupFailed");
         xl $$5 = xl.b($$2.getMessage());
         ffa.Q().ax().a(new fjh(fjh.a.b, $$4, $$5));
         return false;
      } else {
         xl $$6 = xl.a("selectWorld.edit.backupCreated", $$0.f());
         xl $$7 = xl.a("selectWorld.edit.backupSize", ayu.c((double)$$1 / 1048576.0));
         ffa.Q().ax().a(new fjh(fjh.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
