import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fkd extends fkh {
   private static final Logger b = LogUtils.getLogger();
   private static final wo c = wo.c("mco.configure.world.closing");
   private final fhl d;
   private final fiu e;

   public fkd(fhl $$0, fiu $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fgk $$0 = fgk.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fhl.c.a;
               a(this.e);
               break;
            }
         } catch (fih var4) {
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
