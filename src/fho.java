import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fho extends fhn {
   private static final Logger b = LogUtils.getLogger();
   private static final xe c = xe.c("mco.configure.world.opening");
   private final fep d;
   private final fqh e;
   private final boolean f;
   private final fip g;

   public fho(fep $$0, fqh $$1, boolean $$2, fip $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fdy $$0 = fdy.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof ffx) {
                     ((ffx)this.e).f();
                  }

                  this.d.e = fep.c.b;
                  if (this.f) {
                     fdt.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (ffk var4) {
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
   public xe a() {
      return c;
   }
}
