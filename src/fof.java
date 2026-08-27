import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fof extends fjo {
   private static final Logger a = LogUtils.getLogger();
   private static final wg b = wg.c("selectWorld.enterName").a(n.h);
   private static final wg c = wg.c("selectWorld.edit.resetIcon");
   private static final wg d = wg.c("selectWorld.edit.openFolder");
   private static final wg o = wg.c("selectWorld.edit.backup");
   private static final wg p = wg.c("selectWorld.edit.backupFolder");
   private static final wg q = wg.c("selectWorld.edit.optimize");
   private static final wg r = wg.c("optimizeWorld.confirm.title");
   private static final wg s = wg.c("optimizeWorld.confirm.description");
   private static final wg u = wg.c("selectWorld.edit.save");
   private static final int v = 200;
   private static final int w = 4;
   private static final int x = 98;
   private final fhg y = fhg.d().a(5);
   private final BooleanConsumer z;
   private final emr.c A;
   private final fdy B;

   public static fof a(fbp $$0, emr.c $$1, BooleanConsumer $$2) throws IOException {
      ems $$3 = $$1.a($$1.h());
      return new fof($$0, $$1, $$3.b(), $$2);
   }

   private fof(fbp $$0, emr.c $$1, String $$2, BooleanConsumer $$3) {
      super(wg.c("selectWorld.edit.title"));
      this.z = $$3;
      this.A = $$1;
      fda $$4 = $$0.h;
      this.y.a(new fhh(200, 20));
      this.y.a(new few(b, $$4));
      this.B = this.y.a(new fdy($$4, 200, 20, b));
      this.B.a($$2);
      fhg $$5 = fhg.e().a(4);
      fdp $$6 = $$5.a(fdp.a(u, $$0x -> this.a(this.B.a())).a(98).a());
      $$5.a(fdp.a(wf.e, $$0x -> this.d()).a(98).a());
      this.B.b($$1x -> $$6.j = !ayf.h($$1x));
      this.y.a(fdp.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.y.a(fdp.a(d, $$1x -> ac.j().a($$1.a(emp.l).toFile())).a(200).a());
      this.y.a(fdp.a(o, $$1x -> {
         boolean $$2x = a($$1);
         this.z.accept(!$$2x);
      }).a(200).a());
      this.y.a(fdp.a(p, $$1x -> {
         emr $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.j().a($$3x.toFile());
      }).a(200).a());
      this.y.a(fdp.a(q, $$2x -> $$0.a(new fib(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(foh.a($$0, this.z, $$0.at(), $$1, $$3x));
         }, r, s, true))).a(200).a());
      this.y.a(new fhh(200, 20));
      this.y.a($$5);
      this.y.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aD_() {
      this.b(this.B);
   }

   @Override
   protected void aN_() {
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fha.a(this.y, this.G());
   }

   @Override
   public void d() {
      this.z.accept(false);
   }

   private void a(String $$0) {
      try {
         this.A.a($$0);
      } catch (tx | ud | IOException var3) {
         a.error("Failed to access world '{}'", this.A.f(), var3);
         ffx.a(this.j, this.A.f());
      }

      this.z.accept(true);
   }

   public static boolean a(emr.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         wg $$4 = wg.c("selectWorld.edit.backupFailed");
         wg $$5 = wg.b($$2.getMessage());
         fbp.Q().aA().a(new ffx(ffx.a.b, $$4, $$5));
         return false;
      } else {
         wg $$6 = wg.a("selectWorld.edit.backupCreated", $$0.f());
         wg $$7 = wg.a("selectWorld.edit.backupSize", axk.c((double)$$1 / 1048576.0));
         fbp.Q().aA().a(new ffx(ffx.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 15, 16777215);
   }
}
