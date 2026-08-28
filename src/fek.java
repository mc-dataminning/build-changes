import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fek extends fed {
   private static final Logger b = LogUtils.getLogger();
   private static final xo c = xo.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fbu e;
   private final fcm f;

   public fek(long $$0, fbu $$1, fcm $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fam $$0 = fam.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fca var4) {
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
   public xo a() {
      return c;
   }
}
