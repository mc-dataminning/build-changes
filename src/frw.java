import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class frw extends fnf {
   private static final Logger a = LogUtils.getLogger();
   private static final xp b = xp.c("selectWorld.enterName").a(n.h);
   private static final xp c = xp.c("selectWorld.edit.resetIcon");
   private static final xp d = xp.c("selectWorld.edit.openFolder");
   private static final xp r = xp.c("selectWorld.edit.backup");
   private static final xp s = xp.c("selectWorld.edit.backupFolder");
   private static final xp u = xp.c("selectWorld.edit.optimize");
   private static final xp v = xp.c("optimizeWorld.confirm.title");
   private static final xp w = xp.c("optimizeWorld.confirm.description");
   private static final xp x = xp.c("selectWorld.edit.save");
   private static final int y = 200;
   private static final int z = 4;
   private static final int A = 98;
   private final fkx B = fkx.d().a(5);
   private final BooleanConsumer C;
   private final epy.c D;
   private final fhp E;

   public static frw a(ffh $$0, epy.c $$1, BooleanConsumer $$2) throws IOException {
      epz $$3 = $$1.a($$1.h());
      return new frw($$0, $$1, $$3.b(), $$2);
   }

   private frw(ffh $$0, epy.c $$1, String $$2, BooleanConsumer $$3) {
      super(xp.c("selectWorld.edit.title"));
      this.C = $$3;
      this.D = $$1;
      fgr $$4 = $$0.h;
      this.B.a(new fky(200, 20));
      this.B.a(new fin(b, $$4));
      this.E = this.B.a(new fhp($$4, 200, 20, b));
      this.E.a($$2);
      fkx $$5 = fkx.e().a(4);
      fhg $$6 = $$5.a(fhg.a(x, $$0x -> this.a(this.E.a())).a(98).a());
      $$5.a(fhg.a(xo.e, $$0x -> this.d()).a(98).a());
      this.E.b($$1x -> $$6.j = !azv.h($$1x));
      this.B.a(fhg.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.B.a(fhg.a(d, $$1x -> ac.k().a($$1.a(epw.l).toFile())).a(200).a());
      this.B.a(fhg.a(r, $$1x -> {
         boolean $$2x = a($$1);
         this.C.accept(!$$2x);
      }).a(200).a());
      this.B.a(fhg.a(s, $$1x -> {
         epy $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.k().a($$3x.toFile());
      }).a(200).a());
      this.B.a(fhg.a(u, $$2x -> $$0.a(new fls(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fry.a($$0, this.C, $$0.as(), $$1, $$3x));
         }, v, w, true))).a(200).a());
      this.B.a(new fky(200, 20));
      this.B.a($$5);
      this.B.a($$1x -> {
         fhe var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aB_() {
      this.b(this.E);
   }

   @Override
   protected void aM_() {
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
      fkr.a(this.B, this.G());
   }

   @Override
   public void d() {
      this.C.accept(false);
   }

   private void a(String $$0) {
      try {
         this.D.a($$0);
      } catch (vd | vj | IOException var3) {
         a.error("Failed to access world '{}'", this.D.f(), var3);
         fjo.a(this.m, this.D.f());
      }

      this.C.accept(true);
   }

   public static boolean a(epy.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xp $$4 = xp.c("selectWorld.edit.backupFailed");
         xp $$5 = xp.b($$2.getMessage());
         ffh.Q().ax().a(new fjo(fjo.a.b, $$4, $$5));
         return false;
      } else {
         xp $$6 = xp.a("selectWorld.edit.backupCreated", $$0.f());
         xp $$7 = xp.a("selectWorld.edit.backupSize", ayz.c((double)$$1 / 1048576.0));
         ffh.Q().ax().a(new fjo(fjo.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
