import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eum extends eur {
   private static final Logger b = LogUtils.getLogger();
   private static final vg c = vg.c("mco.configure.world.closing");
   private final err d;
   private final eta e;

   public eum(err $$0, eta $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      era $$0 = era.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = err.c.a;
               a(this.e);
               break;
            }
         } catch (eso var4) {
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
   public vg a() {
      return c;
   }
}
