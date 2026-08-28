import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class flb extends flf {
   private static final Logger b = LogUtils.getLogger();
   private static final xv c = xv.c("mco.configure.world.closing");
   private final fij d;
   private final fjs e;

   public flb(fij $$0, fjs $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fhi $$0 = fhi.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fij.c.a;
               a(this.e);
               break;
            }
         } catch (fjf var4) {
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
   public xv a() {
      return c;
   }
}
