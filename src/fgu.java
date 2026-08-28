import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fgu extends fgz {
   private static final Logger b = LogUtils.getLogger();
   private static final xd c = xd.c("mco.configure.world.closing");
   private final feb d;
   private final ffj e;

   public fgu(feb $$0, ffj $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fdk $$0 = fdk.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = feb.c.a;
               a(this.e);
               break;
            }
         } catch (few var4) {
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
   public xd a() {
      return c;
   }
}
