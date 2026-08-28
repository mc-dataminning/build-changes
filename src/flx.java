import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class flx extends fmb {
   private static final Logger b = LogUtils.getLogger();
   private static final wv c = wv.c("mco.configure.world.closing");
   private final fjf d;
   private final fko e;

   public flx(fjf $$0, fko $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fie $$0 = fie.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fjf.c.a;
               a(this.e);
               break;
            }
         } catch (fkb var4) {
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
   public wv a() {
      return c;
   }
}
