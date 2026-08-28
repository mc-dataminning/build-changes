import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fmz extends fnd {
   private static final Logger b = LogUtils.getLogger();
   private static final ww c = ww.c("mco.configure.world.closing");
   private final fkh d;
   private final flq e;

   public fmz(fkh $$0, flq $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fjg $$0 = fjg.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fkh.c.a;
               a(this.e);
               break;
            }
         } catch (fld var4) {
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
   public ww a() {
      return c;
   }
}
