import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class etv extends eua {
   private static final Logger b = LogUtils.getLogger();
   private static final vd c = vd.c("mco.configure.world.closing");
   private final era d;
   private final esj e;

   public etv(era $$0, esj $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      eqj $$0 = eqj.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.e();
               this.d.e = era.c.a;
               a(this.e);
               break;
            }
         } catch (erx var4) {
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
   public vd a() {
      return c;
   }
}
