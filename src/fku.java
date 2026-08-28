import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fku extends fky {
   private static final Logger b = LogUtils.getLogger();
   private static final xk c = xk.c("mco.configure.world.closing");
   private final fic d;
   private final fjl e;

   public fku(fic $$0, fjl $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fhb $$0 = fhb.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fic.c.a;
               a(this.e);
               break;
            }
         } catch (fiy var4) {
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
   public xk a() {
      return c;
   }
}
