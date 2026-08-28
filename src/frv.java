import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class frv extends fne {
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
   private final fkw B = fkw.d().a(5);
   private final BooleanConsumer C;
   private final epx.c D;
   private final fho E;

   public static frv a(ffg $$0, epx.c $$1, BooleanConsumer $$2) throws IOException {
      epy $$3 = $$1.a($$1.h());
      return new frv($$0, $$1, $$3.b(), $$2);
   }

   private frv(ffg $$0, epx.c $$1, String $$2, BooleanConsumer $$3) {
      super(xp.c("selectWorld.edit.title"));
      this.C = $$3;
      this.D = $$1;
      fgq $$4 = $$0.h;
      this.B.a(new fkx(200, 20));
      this.B.a(new fim(b, $$4));
      this.E = this.B.a(new fho($$4, 200, 20, b));
      this.E.a($$2);
      fkw $$5 = fkw.e().a(4);
      fhf $$6 = $$5.a(fhf.a(x, $$0x -> this.a(this.E.a())).a(98).a());
      $$5.a(fhf.a(xo.e, $$0x -> this.d()).a(98).a());
      this.E.b($$1x -> $$6.j = !azv.h($$1x));
      this.B.a(fhf.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.B.a(fhf.a(d, $$1x -> ac.k().a($$1.a(epv.l).toFile())).a(200).a());
      this.B.a(fhf.a(r, $$1x -> {
         boolean $$2x = a($$1);
         this.C.accept(!$$2x);
      }).a(200).a());
      this.B.a(fhf.a(s, $$1x -> {
         epx $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.k().a($$3x.toFile());
      }).a(200).a());
      this.B.a(fhf.a(u, $$2x -> $$0.a(new flr(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(frx.a($$0, this.C, $$0.as(), $$1, $$3x));
         }, v, w, true))).a(200).a());
      this.B.a(new fkx(200, 20));
      this.B.a($$5);
      this.B.a($$1x -> {
         fhd var10000 = this.c($$1x);
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
      fkq.a(this.B, this.G());
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
         fjn.a(this.m, this.D.f());
      }

      this.C.accept(true);
   }

   public static boolean a(epx.c $$0) {
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
         ffg.Q().ax().a(new fjn(fjn.a.b, $$4, $$5));
         return false;
      } else {
         xp $$6 = xp.a("selectWorld.edit.backupCreated", $$0.f());
         xp $$7 = xp.a("selectWorld.edit.backupSize", ayz.c((double)$$1 / 1048576.0));
         ffg.Q().ax().a(new fjn(fjn.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 15, 16777215);
   }
}
