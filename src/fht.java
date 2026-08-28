import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fht extends fhy {
   private static final Logger b = LogUtils.getLogger();
   private static final xh c = xh.c("mco.configure.world.closing");
   private final ffa d;
   private final fgi e;

   public fht(ffa $$0, fgi $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fej $$0 = fej.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = ffa.c.a;
               a(this.e);
               break;
            }
         } catch (ffv var4) {
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
   public xh a() {
      return c;
   }
}
