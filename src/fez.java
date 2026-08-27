import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class fez extends fah {
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
   private final eya v = eya.d().a(5);
   private final BooleanConsumer w;
   private final eeb.c x;

   public static fez a(esr $$0, eeb.c $$1, BooleanConsumer $$2) throws IOException {
      eec $$3 = $$1.a($$1.f());
      return new fez($$0, $$1, $$3.b(), $$2);
   }

   private fez(esr $$0, eeb.c $$1, String $$2, BooleanConsumer $$3) {
      super(ur.c("selectWorld.edit.title"));
      this.w = $$3;
      this.x = $$1;
      etz $$4 = $$0.h;
      this.v.a(new eyb(200, 20));
      this.v.a(new evt(b, $$4));
      euv $$5 = this.v.a(new euv($$4, 200, 20, b));
      $$5.a($$2);
      eya $$6 = eya.e().a(4);
      eum $$7 = $$6.a(eum.a(q, $$1x -> this.a($$5.a())).a(98).a());
      $$6.a(eum.a(uq.e, $$0x -> this.aE_()).a(98).a());
      $$5.b($$1x -> $$7.i = !ac.b($$1x));
      this.v.a(eum.a(c, $$1x -> {
         $$1.h().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.i = false;
      }).a(200).a()).i = $$1.h().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.v.a(eum.a(k, $$1x -> ac.i().a($$1.a(edz.l).toFile())).a(200).a());
      this.v.a(eum.a(l, $$1x -> {
         boolean $$2x = a($$1);
         this.w.accept(!$$2x);
      }).a(200).a());
      this.v.a(eum.a(m, $$1x -> {
         eeb $$2x = $$0.l();
         Path $$3x = $$2x.d();

         try {
            v.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ac.i().a($$3x.toFile());
      }).a(200).a());
      this.v.a(eum.a(n, $$2x -> $$0.a(new eyv(() -> $$0.a(this), ($$2xx, $$3x) -> {
            if ($$2xx) {
               a($$1);
            }

            $$0.a(ffb.a($$0, this.w, $$0.aq(), $$1, $$3x));
         }, o, p, true))).a(200).a());
      this.v.a(new eyb(200, 20));
      this.v.a($$6);
      this.c($$5);
      this.v.a($$1x -> {
         euk var10000 = this.d($$1x);
      });
   }

   @Override
   protected void aO_() {
      this.c();
   }

   @Override
   protected void c() {
      this.v.a();
      exu.a(this.v, this.s());
   }

   @Override
   public void aE_() {
      this.w.accept(false);
   }

   private void a(String $$0) {
      try {
         this.x.a($$0);
      } catch (sk | sq | IOException var3) {
         a.error("Failed to access world '{}'", this.x.d(), var3);
         ewt.a(this.f, this.x.d());
      }

      this.w.accept(true);
   }

   public static boolean a(eeb.c $$0) {
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
         esr.N().ax().a(new ewt(ewt.a.c, $$4, $$5));
         return false;
      } else {
         ur $$6 = ur.a("selectWorld.edit.backupCreated", $$0.d());
         ur $$7 = ur.a("selectWorld.edit.backupSize", ati.c((double)$$1 / 1048576.0));
         esr.N().ax().a(new ewt(ewt.a.c, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 15, 16777215);
   }
}
