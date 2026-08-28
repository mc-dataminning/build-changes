import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fpz extends fqd {
   private static final Logger b = LogUtils.getLogger();
   private static final xc c = xc.c("mco.configure.world.closing");
   private final fng d;
   private final fop e;

   public fpz(fng $$0, fop $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fmf $$0 = fmf.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fng.c.a;
               a(this.e);
               break;
            }
         } catch (foc var4) {
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
   public xc a() {
      return c;
   }
}
