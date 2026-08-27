import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ery extends esd {
   private static final Logger b = LogUtils.getLogger();
   private static final ur c = ur.c("mco.configure.world.closing");
   private final epd d;
   private final eqm e;

   public ery(epd $$0, eqm $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      eom $$0 = eom.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.e();
               this.d.e = epd.c.a;
               a(this.e);
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

            b.error("Failed to close server", var5);
            this.a(var5);
         }
      }
   }

   @Override
   public ur a() {
      return c;
   }
}
