import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fkz extends fky {
   private static final Logger b = LogUtils.getLogger();
   private static final xv c = xv.c("mco.configure.world.opening");
   private final fic d;
   private final ftr e;
   private final boolean f;
   private final flz g;

   public fkz(fic $$0, ftr $$1, boolean $$2, flz $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fhb $$0 = fhb.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fjl) {
                     ((fjl)this.e).f();
                  }

                  this.d.e = fic.c.b;
                  if (this.f) {
                     fgw.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fiy var4) {
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
   public xv a() {
      return c;
   }
}
