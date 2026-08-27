import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eub extends eug {
   private static final Logger b = LogUtils.getLogger();
   private static final vf c = vf.c("mco.configure.world.closing");
   private final erg d;
   private final esp e;

   public eub(erg $$0, esp $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      eqp $$0 = eqp.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.e();
               this.d.e = erg.c.a;
               a(this.e);
               break;
            }
         } catch (esd var4) {
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
   public vf a() {
      return c;
   }
}
