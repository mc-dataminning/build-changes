import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fiz extends fjd {
   private static final Logger b = LogUtils.getLogger();
   private static final xj c = xj.c("mco.configure.world.closing");
   private final fgi d;
   private final fhq e;

   public fiz(fgi $$0, fhq $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      ffh $$0 = ffh.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fgi.c.a;
               a(this.e);
               break;
            }
         } catch (fhd var4) {
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
   public xj a() {
      return c;
   }
}
