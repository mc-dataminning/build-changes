import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fom extends fol {
   private static final Logger b = LogUtils.getLogger();
   private static final wy c = wy.c("mco.configure.world.opening");
   private final flp d;
   private final fyn e;
   private final boolean f;
   private final fpo g;

   public fom(flp $$0, fyn $$1, boolean $$2, fpo $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fko $$0 = fko.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fmy) {
                     ((fmy)this.e).f();
                  }

                  this.d.e = flp.c.b;
                  if (this.f) {
                     fkj.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fml var4) {
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
   public wy a() {
      return c;
   }
}
