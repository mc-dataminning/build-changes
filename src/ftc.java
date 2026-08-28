import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class ftc extends fob {
   private static final Logger a = LogUtils.getLogger();
   private static final wz b = wz.c("selectWorld.enterName").a(n.h);
   private static final wz c = wz.c("selectWorld.edit.resetIcon");
   private static final wz r = wz.c("selectWorld.edit.openFolder");
   private static final wz s = wz.c("selectWorld.edit.backup");
   private static final wz u = wz.c("selectWorld.edit.backupFolder");
   private static final wz v = wz.c("selectWorld.edit.optimize");
   private static final wz w = wz.c("optimizeWorld.confirm.title");
   private static final wz x = wz.c("optimizeWorld.confirm.description");
   private static final wz y = wz.c("selectWorld.edit.save");
   private static final int z = 200;
   private static final int A = 4;
   private static final int B = 98;
   private final fmb C = fmb.d().a(5);
   private final BooleanConsumer D;
   private final erd.c E;
   private final fit F;

   public static ftc a(fgm $$0, erd.c $$1, BooleanConsumer $$2) throws IOException {
      ere $$3 = $$1.a($$1.h());
      return new ftc($$0, $$1, $$3.b(), $$2);
   }

   private ftc(fgm $$0, erd.c $$1, String $$2, BooleanConsumer $$3) {
      super(wz.c("selectWorld.edit.title"));
      this.D = $$3;
      this.E = $$1;
      fhv $$4 = $$0.h;
      this.C.a(new fmc(200, 20));
      this.C.a(new fjr(b, $$4));
      this.F = this.C.a(new fit($$4, 200, 20, b));
      this.F.a($$2);
      fmb $$5 = fmb.e().a(4);
      fik $$6 = $$5.a(fik.a(y, $$0x -> this.a(this.F.a())).a(98).a());
      $$5.a(fik.a(wy.e, $$0x -> this.d()).a(98).a());
      this.F.b($$1x -> $$6.j = !azl.h($$1x));
      this.C.a(fik.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.C.a(fik.a(r, $$1x -> ad.k().a($$1.a(erb.l))).a(200).a());
      this.C.a(fik.a(s, $$1x -> {
         boolean $$2x = a($$1);
         this.D.accept(!$$2x);
      }).a(200).a());
      this.C.a(fik.a(u, $$1x -> {
         erd $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ad.k().a($$3x);
      }).a(200).a());
      this.C.a(fik.a(v, $$2x -> $$0.a(new fmv(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(fte.a($$0, this.D, $$0.as(), $$1, $$3x));
         }, w, x, true))).a(200).a());
      this.C.a(new fmc(200, 20));
      this.C.a($$5);
      this.C.a($$1x -> {
         fii var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aI_() {
      this.b(this.F);
   }

   @Override
   protected void aT_() {
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      flv.a(this.C, this.H());
   }

   @Override
   public void d() {
      this.D.accept(false);
   }

   private void a(String $$0) {
      try {
         this.E.a($$0);
      } catch (um | us | IOException var3) {
         a.error("Failed to access world '{}'", this.E.f(), var3);
         fks.a(this.l, this.E.f());
      }

      this.D.accept(true);
   }

   public static boolean a(erd.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         wz $$4 = wz.c("selectWorld.edit.backupFailed");
         wz $$5 = wz.b($$2.getMessage());
         fgm.Q().aw().a(new fks(fks.a.b, $$4, $$5));
         return false;
      } else {
         wz $$6 = wz.a("selectWorld.edit.backupCreated", $$0.f());
         wz $$7 = wz.a("selectWorld.edit.backupSize", ayo.c((double)$$1 / 1048576.0));
         fgm.Q().aw().a(new fks(fks.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 15, 16777215);
   }
}
