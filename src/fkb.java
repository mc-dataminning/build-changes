import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fkb extends fkf {
   private static final Logger b = LogUtils.getLogger();
   private static final wo c = wo.c("mco.configure.world.closing");
   private final fhj d;
   private final fis e;

   public fkb(fhj $$0, fis $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fgi $$0 = fgi.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fhj.c.a;
               a(this.e);
               break;
            }
         } catch (fif var4) {
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
   public wo a() {
      return c;
   }
}
