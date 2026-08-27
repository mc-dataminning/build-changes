import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbp extends fbu {
   private static final Logger b = LogUtils.getLogger();
   private static final ws c = ws.c("mco.configure.world.closing");
   private final eyu d;
   private final fad e;

   public fbp(eyu $$0, fad $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      eyd $$0 = eyd.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = eyu.c.a;
               a(this.e);
               break;
            }
         } catch (ezr var4) {
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
   public ws a() {
      return c;
   }
}
