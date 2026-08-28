import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fkj extends fki {
   private static final Logger b = LogUtils.getLogger();
   private static final wp c = wp.c("mco.configure.world.opening");
   private final fhm d;
   private final fum e;
   private final boolean f;
   private final flk g;

   public fkj(fhm $$0, fum $$1, boolean $$2, flk $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fgl $$0 = fgl.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fiv) {
                     ((fiv)this.e).f();
                  }

                  this.d.e = fhm.c.b;
                  if (this.f) {
                     fgg.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fii var4) {
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
   public wp a() {
      return c;
   }
}
