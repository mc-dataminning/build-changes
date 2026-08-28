import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fdv extends fea {
   private static final Logger b = LogUtils.getLogger();
   private static final xl c = xl.c("mco.configure.world.closing");
   private final fba d;
   private final fcj e;

   public fdv(fba $$0, fcj $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      faj $$0 = faj.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = fba.c.a;
               a(this.e);
               break;
            }
         } catch (fbx var4) {
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
