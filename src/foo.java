import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class foo extends fjx {
   private static final Logger a = LogUtils.getLogger();
   private static final wi b = wi.c("selectWorld.enterName").a(n.h);
   private static final wi c = wi.c("selectWorld.edit.resetIcon");
   private static final wi d = wi.c("selectWorld.edit.openFolder");
   private static final wi o = wi.c("selectWorld.edit.backup");
   private static final wi p = wi.c("selectWorld.edit.backupFolder");
   private static final wi q = wi.c("selectWorld.edit.optimize");
   private static final wi r = wi.c("optimizeWorld.confirm.title");
   private static final wi s = wi.c("optimizeWorld.confirm.description");
   private static final wi u = wi.c("selectWorld.edit.save");
   private static final int v = 200;
   private static final int w = 4;
   private static final int x = 98;
   private final fhp y = fhp.d().a(5);
   private final BooleanConsumer z;
   private final ena.c A;
   private final feh B;

   public static foo a(fby $$0, ena.c $$1, BooleanConsumer $$2) throws IOException {
      enb $$3 = $$1.a($$1.h());
      return new foo($$0, $$1, $$3.b(), $$2);
   }

   private foo(fby $$0, ena.c $$1, String $$2, BooleanConsumer $$3) {
      super(wi.c("selectWorld.edit.title"));
      this.z = $$3;
      this.A = $$1;
      fdj $$4 = $$0.h;
      this.y.a(new fhq(200, 20));
      this.y.a(new fff(b, $$4));
      this.B = this.y.a(new feh($$4, 200, 20, b));
      this.B.a($$2);
      fhp $$5 = fhp.e().a(4);
      fdy $$6 = $$5.a(fdy.a(u, $$0x -> this.a(this.B.a())).a(98).a());
      $$5.a(fdy.a(wh.e, $$0x -> this.d()).a(98).a());
      this.B.b($$1x -> $$6.j = !ayh.h($$1x));
      this.y.a(fdy.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.y.a(fdy.a(d, $$1x -> ac.j().a($$1.a(emy.l).toFile())).a(200).a());
      this.y.a(fdy.a(o, $$1x -> {
         boolean $$2x = a($$1);
         this.z.accept(!$$2x);
      }).a(200).a());
      this.y.a(fdy.a(p, $$1x -> {
         ena $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.j().a($$3x.toFile());
      }).a(200).a());
      this.y.a(fdy.a(q, $$2x -> $$0.a(new fik(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(foq.a($$0, this.z, $$0.at(), $$1, $$3x));
         }, r, s, true))).a(200).a());
      this.y.a(new fhq(200, 20));
      this.y.a($$5);
      this.y.a($$1x -> {
         fdw var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aC_() {
      this.b(this.B);
   }

   @Override
   protected void aM_() {
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      fhj.a(this.y, this.G());
   }

   @Override
   public void d() {
      this.z.accept(false);
   }

   private void a(String $$0) {
      try {
         this.A.a($$0);
      } catch (tz | uf | IOException var3) {
         a.error("Failed to access world '{}'", this.A.f(), var3);
         fgg.a(this.j, this.A.f());
      }

      this.z.accept(true);
   }

   public static boolean a(ena.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         wi $$4 = wi.c("selectWorld.edit.backupFailed");
         wi $$5 = wi.b($$2.getMessage());
         fby.Q().aA().a(new fgg(fgg.a.b, $$4, $$5));
         return false;
      } else {
         wi $$6 = wi.a("selectWorld.edit.backupCreated", $$0.f());
         wi $$7 = wi.a("selectWorld.edit.backupSize", axm.c((double)$$1 / 1048576.0));
         fby.Q().aA().a(new fgg(fgg.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 15, 16777215);
   }
}
