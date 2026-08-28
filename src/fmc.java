import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fmc extends fmb {
   private static final Logger b = LogUtils.getLogger();
   private static final wv c = wv.c("mco.configure.world.opening");
   private final fjf d;
   private final fwf e;
   private final boolean f;
   private final fnd g;

   public fmc(fjf $$0, fwf $$1, boolean $$2, fnd $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fie $$0 = fie.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fko) {
                     ((fko)this.e).f();
                  }

                  this.d.e = fjf.c.b;
                  if (this.f) {
                     fhz.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fkb var4) {
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
   public wv a() {
      return c;
   }
}
