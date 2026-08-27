import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class flx extends fhf {
   private static final Logger a = LogUtils.getLogger();
   private static final vu b = vu.c("selectWorld.enterName").a(n.h);
   private static final vu c = vu.c("selectWorld.edit.resetIcon");
   private static final vu k = vu.c("selectWorld.edit.openFolder");
   private static final vu l = vu.c("selectWorld.edit.backup");
   private static final vu m = vu.c("selectWorld.edit.backupFolder");
   private static final vu n = vu.c("selectWorld.edit.optimize");
   private static final vu o = vu.c("optimizeWorld.confirm.title");
   private static final vu p = vu.c("optimizeWorld.confirm.description");
   private static final vu q = vu.c("selectWorld.edit.save");
   private static final int r = 200;
   private static final int t = 4;
   private static final int u = 98;
   private final fex v = fex.d().a(5);
   private final BooleanConsumer w;
   private final ekk.c x;
   private final fbp y;

   public static flx a(ezg $$0, ekk.c $$1, BooleanConsumer $$2) throws IOException {
      ekl $$3 = $$1.a($$1.f());
      return new flx($$0, $$1, $$3.b(), $$2);
   }

   private flx(ezg $$0, ekk.c $$1, String $$2, BooleanConsumer $$3) {
      super(vu.c("selectWorld.edit.title"));
      this.w = $$3;
      this.x = $$1;
      far $$4 = $$0.h;
      this.v.a(new fey(200, 20));
      this.v.a(new fcn(b, $$4));
      this.y = this.v.a(new fbp($$4, 200, 20, b));
      this.y.a($$2);
      fex $$5 = fex.e().a(4);
      fbg $$6 = $$5.a(fbg.a(q, $$0x -> this.a(this.y.a())).a(98).a());
      $$5.a(fbg.a(vt.e, $$0x -> this.d()).a(98).a());
      this.y.b($$1x -> $$6.j = !ac.b($$1x));
      this.v.a(fbg.a(c, $$1x -> {
         $$1.h().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.h().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.v.a(fbg.a(k, $$1x -> ac.j().a($$1.a(eki.l).toFile())).a(200).a());
      this.v.a(fbg.a(l, $$1x -> {
         boolean $$2x = a($$1);
         this.w.accept(!$$2x);
      }).a(200).a());
      this.v.a(fbg.a(m, $$1x -> {
         ekk $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.j().a($$3x.toFile());
      }).a(200).a());
      this.v.a(fbg.a(n, $$2x -> $$0.a(new ffs(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(flz.a($$0, this.w, $$0.at(), $$1, $$3x));
         }, o, p, true))).a(200).a());
      this.v.a(new fey(200, 20));
      this.v.a($$5);
      this.v.a($$1x -> {
         fbe var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aF_() {
      this.b(this.y);
   }

   @Override
   protected void aO_() {
      this.c();
   }

   @Override
   protected void c() {
      this.v.a();
      fer.a(this.v, this.F());
   }

   @Override
   public void d() {
      this.w.accept(false);
   }

   private void a(String $$0) {
      try {
         this.x.a($$0);
      } catch (tl | tr | IOException var3) {
         a.error("Failed to access world '{}'", this.x.d(), var3);
         fdo.a(this.f, this.x.d());
      }

      this.w.accept(true);
   }

   public static boolean a(ekk.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.j();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         vu $$4 = vu.c("selectWorld.edit.backupFailed");
         vu $$5 = vu.b($$2.getMessage());
         ezg.Q().aA().a(new fdo(fdo.a.b, $$4, $$5));
         return false;
      } else {
         vu $$6 = vu.a("selectWorld.edit.backupCreated", $$0.d());
         vu $$7 = vu.a("selectWorld.edit.backupSize", aww.c((double)$$1 / 1048576.0));
         ezg.Q().aA().a(new fdo(fdo.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
