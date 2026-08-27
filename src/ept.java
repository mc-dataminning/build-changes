import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ept extends epx {
   private static final Logger b = LogUtils.getLogger();
   private static final tn c = tn.c("mco.configure.world.closing");
   private final emy d;
   private final eoh e;

   public ept(emy $$0, eoh $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      emh $$0 = emh.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.e();
               this.d.e = emy.b.a;
               a(this.e);
               break;
            }
         } catch (env var4) {
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
   public tn a() {
      return c;
   }
}
