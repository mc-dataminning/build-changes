import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffc extends ffh {
   private static final Logger b = LogUtils.getLogger();
   private static final wy c = wy.c("mco.configure.world.closing");
   private final fcj d;
   private final fdr e;

   public ffc(fcj $$0, fdr $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fbs $$0 = fbs.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fcj.c.a;
               a(this.e);
               break;
            }
         } catch (fde var4) {
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
   public wy a() {
      return c;
   }
}
