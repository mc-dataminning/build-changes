import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fpp extends fpo {
   private static final Logger b = LogUtils.getLogger();
   private static final xg c = xg.c("mco.configure.world.opening");
   private final fmr d;
   private final fzq e;
   private final boolean f;
   private final fqq g;

   public fpp(fmr $$0, fzq $$1, boolean $$2, fqq $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      flq $$0 = flq.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof foa) {
                     ((foa)this.e).f();
                  }

                  this.d.e = fmr.c.b;
                  if (this.f) {
                     fll.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fnn var4) {
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
   public xg a() {
      return c;
   }
}
