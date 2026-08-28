import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fdz extends fee {
   private static final Logger b = LogUtils.getLogger();
   private static final xo c = xo.c("mco.configure.world.closing");
   private final fbe d;
   private final fcn e;

   public fdz(fbe $$0, fcn $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fan $$0 = fan.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = fbe.c.a;
               a(this.e);
               break;
            }
         } catch (fcb var4) {
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
   public xo a() {
      return c;
   }
}
