import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class euj extends eui {
   private static final Logger b = LogUtils.getLogger();
   private static final vf c = vf.c("mco.configure.world.opening");
   private final eri d;
   private final fdb e;
   private final boolean f;
   private final evi g;

   public euj(eri $$0, fdb $$1, boolean $$2, evi $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      eqr $$0 = eqr.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof esr) {
                     ((esr)this.e).e();
                  }

                  this.d.e = eri.c.b;
                  if (this.f) {
                     eqm.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (esf var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
         } catch (Exception var5) {
            if (this.d()) {
               return;
            }

            b.error("Failed to open server", var5);
            this.a(var5);
         }
      }
   }

   @Override
   public vf a() {
      return c;
   }
}
