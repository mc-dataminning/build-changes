import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fke extends fki {
   private static final Logger b = LogUtils.getLogger();
   private static final wp c = wp.c("mco.configure.world.closing");
   private final fhm d;
   private final fiv e;

   public fke(fhm $$0, fiv $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fgl $$0 = fgl.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fhm.c.a;
               a(this.e);
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

            b.error("Failed to close server", var5);
            this.a(var5);
         }
      }
   }

   @Override
   public wp a() {
      return c;
   }
}
