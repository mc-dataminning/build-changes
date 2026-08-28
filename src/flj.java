import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class flj extends fld {
   private static final Logger b = LogUtils.getLogger();
   private static final xv c = xv.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fix e;
   private final fjq f;

   public flj(long $$0, fix $$1, fjq $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fhg $$0 = fhg.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fjd var4) {
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
   public xv a() {
      return c;
   }
}
