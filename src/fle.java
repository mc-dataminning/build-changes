import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fle extends fld {
   private static final Logger b = LogUtils.getLogger();
   private static final xv c = xv.c("mco.configure.world.opening");
   private final fih d;
   private final ftw e;
   private final boolean f;
   private final fme g;

   public fle(fih $$0, ftw $$1, boolean $$2, fme $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fhg $$0 = fhg.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fjq) {
                     ((fjq)this.e).f();
                  }

                  this.d.e = fih.c.b;
                  if (this.f) {
                     fhb.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fjd var4) {
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
