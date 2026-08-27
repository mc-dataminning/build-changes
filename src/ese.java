import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ese extends esd {
   private static final Logger b = LogUtils.getLogger();
   private static final ur c = ur.c("mco.configure.world.opening");
   private final epd d;
   private final fau e;
   private final boolean f;
   private final etd g;

   public ese(epd $$0, fau $$1, boolean $$2, etd $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      eom $$0 = eom.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof eqm) {
                     ((eqm)this.e).e();
                  }

                  this.d.e = epd.c.b;
                  if (this.f) {
                     eoh.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (eqa var4) {
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
   public ur a() {
      return c;
   }
}
