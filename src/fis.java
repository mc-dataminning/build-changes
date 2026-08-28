import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fis extends fiw {
   private static final Logger b = LogUtils.getLogger();
   private static final xl c = xl.c("mco.configure.world.closing");
   private final fgb d;
   private final fhj e;

   public fis(fgb $$0, fhj $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      ffa $$0 = ffa.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fgb.c.a;
               a(this.e);
               break;
            }
         } catch (fgw var4) {
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
   public xl a() {
      return c;
   }
}
