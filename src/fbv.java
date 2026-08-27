import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbv extends fbu {
   private static final Logger b = LogUtils.getLogger();
   private static final ws c = ws.c("mco.configure.world.opening");
   private final eyu d;
   private final fkt e;
   private final boolean f;
   private final fcu g;

   public fbv(eyu $$0, fkt $$1, boolean $$2, fcu $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      eyd $$0 = eyd.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fad) {
                     ((fad)this.e).b();
                  }

                  this.d.e = eyu.c.b;
                  if (this.f) {
                     exy.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (ezr var4) {
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
   public ws a() {
      return c;
   }
}
