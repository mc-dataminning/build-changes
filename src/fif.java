import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fif extends fhy {
   private static final Logger b = LogUtils.getLogger();
   private static final xh c = xh.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final ffp e;
   private final fgi f;

   public fif(long $$0, ffp $$1, fgi $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fej $$0 = fej.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
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

            b.error("Couldn't start mini game!");
            this.a(var5);
         }
      }
   }

   @Override
   public xh a() {
      return c;
   }
}
