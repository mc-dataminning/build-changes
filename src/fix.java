import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fix extends fiw {
   private static final Logger b = LogUtils.getLogger();
   private static final xl c = xl.c("mco.configure.world.opening");
   private final fgb d;
   private final frp e;
   private final boolean f;
   private final fjx g;

   public fix(fgb $$0, frp $$1, boolean $$2, fjx $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      ffa $$0 = ffa.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fhj) {
                     ((fhj)this.e).f();
                  }

                  this.d.e = fgb.c.b;
                  if (this.f) {
                     fev.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fgw var4) {
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
   public xl a() {
      return c;
   }
}
