import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class etf extends etk {
   private static final Logger b = LogUtils.getLogger();
   private static final vb c = vb.c("mco.configure.world.closing");
   private final eqk d;
   private final ert e;

   public etf(eqk $$0, ert $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      ept $$0 = ept.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.e();
               this.d.e = eqk.c.a;
               a(this.e);
               break;
            }
         } catch (erh var4) {
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
   public vb a() {
      return c;
   }
}
