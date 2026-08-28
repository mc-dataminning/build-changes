import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fhg extends fgz {
   private static final Logger b = LogUtils.getLogger();
   private static final xd c = xd.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final feq e;
   private final ffj f;

   public fhg(long $$0, feq $$1, ffj $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fdk $$0 = fdk.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
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

            b.error("Couldn't start mini game!");
            this.a(var5);
         }
      }
   }

   @Override
   public xd a() {
      return c;
   }
}
