import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class foc extends fnw {
   private static final Logger b = LogUtils.getLogger();
   private static final wy c = wy.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final flq e;
   private final fmj f;

   public foc(long $$0, flq $$1, fmj $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fjz $$0 = fjz.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (flw var4) {
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
   public wy a() {
      return c;
   }
}
