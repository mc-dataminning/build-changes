import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fak extends fap {
   private static final Logger b = LogUtils.getLogger();
   private static final wg c = wg.c("mco.configure.world.closing");
   private final exp d;
   private final eyy e;

   public fak(exp $$0, eyy $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      ewy $$0 = ewy.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = exp.c.a;
               a(this.e);
               break;
            }
         } catch (eym var4) {
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
   public wg a() {
      return c;
   }
}
