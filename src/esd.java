import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class esd extends esi {
   private static final Logger b = LogUtils.getLogger();
   private static final uv c = uv.c("mco.configure.world.closing");
   private final epi d;
   private final eqr e;

   public esd(epi $$0, eqr $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      eor $$0 = eor.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.e();
               this.d.e = epi.c.a;
               a(this.e);
               break;
            }
         } catch (eqf var4) {
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
   public uv a() {
      return c;
   }
}
