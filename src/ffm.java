import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class ffm extends fau {
   private static final Logger a = LogUtils.getLogger();
   private static final ur b = ur.c("selectWorld.enterName").a(n.h);
   private static final ur c = ur.c("selectWorld.edit.resetIcon");
   private static final ur k = ur.c("selectWorld.edit.openFolder");
   private static final ur l = ur.c("selectWorld.edit.backup");
   private static final ur m = ur.c("selectWorld.edit.backupFolder");
   private static final ur n = ur.c("selectWorld.edit.optimize");
   private static final ur o = ur.c("optimizeWorld.confirm.title");
   private static final ur p = ur.c("optimizeWorld.confirm.description");
   private static final ur q = ur.c("selectWorld.edit.save");
   private static final int r = 200;
   private static final int t = 4;
   private static final int u = 98;
   private final eyn v = eyn.d().a(5);
   private final BooleanConsumer w;
   private final een.c x;

   public static ffm a(etd $$0, een.c $$1, BooleanConsumer $$2) throws IOException {
      eeo $$3 = $$1.a($$1.f());
      return new ffm($$0, $$1, $$3.b(), $$2);
   }

   private ffm(etd $$0, een.c $$1, String $$2, BooleanConsumer $$3) {
      super(ur.c("selectWorld.edit.title"));
      this.w = $$3;
      this.x = $$1;
      eum $$4 = $$0.h;
      this.v.a(new eyo(200, 20));
      this.v.a(new ewg(b, $$4));
      evi $$5 = this.v.a(new evi($$4, 200, 20, b));
      $$5.a($$2);
      eyn $$6 = eyn.e().a(4);
      euz $$7 = $$6.a(euz.a(q, $$1x -> this.a($$5.a())).a(98).a());
      $$6.a(euz.a(uq.e, $$0x -> this.aF_()).a(98).a());
      $$5.b($$1x -> $$7.i = !ac.b($$1x));
      this.v.a(euz.a(c, $$1x -> {
         $$1.h().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.i = false;
      }).a(200).a()).i = $$1.h().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.v.a(euz.a(k, $$1x -> ac.i().a($$1.a(eel.l).toFile())).a(200).a());
      this.v.a(euz.a(l, $$1x -> {
         boolean $$2x = a($$1);
         this.w.accept(!$$2x);
      }).a(200).a());
      this.v.a(euz.a(m, $$1x -> {
         een $$2x = $$0.l();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.i().a($$3x.toFile());
      }).a(200).a());
      this.v.a(euz.a(n, $$2x -> $$0.a(new ezi(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(ffo.a($$0, this.w, $$0.aq(), $$1, $$3x));
         }, o, p, true))).a(200).a());
      this.v.a(new eyo(200, 20));
      this.v.a($$6);
      this.c($$5);
      this.v.a($$1x -> {
         eux var10000 = this.d($$1x);
      });
   }

   @Override
   protected void aP_() {
      this.c();
   }

   @Override
   protected void c() {
      this.v.a();
      eyh.a(this.v, this.s());
   }

   @Override
   public void aF_() {
      this.w.accept(false);
   }

   private void a(String $$0) {
      try {
         this.x.a($$0);
      } catch (sk | sq | IOException var3) {
         a.error("Failed to access world '{}'", this.x.d(), var3);
         exg.a(this.f, this.x.d());
      }

      this.w.accept(true);
   }

   public static boolean a(een.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.j();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         ur $$4 = ur.c("selectWorld.edit.backupFailed");
         ur $$5 = ur.b($$2.getMessage());
         etd.N().ax().a(new exg(exg.a.c, $$4, $$5));
         return false;
      } else {
         ur $$6 = ur.a("selectWorld.edit.backupCreated", $$0.d());
         ur $$7 = ur.a("selectWorld.edit.backupSize", atm.c((double)$$1 / 1048576.0));
         etd.N().ax().a(new exg(exg.a.c, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
