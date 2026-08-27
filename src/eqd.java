import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eqd extends epx {
   private static final Logger b = LogUtils.getLogger();
   private static final tn c = tn.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final enp e;
   private final eoh f;

   public eqd(long $$0, enp $$1, eoh $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      emh $$0 = emh.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (env var4) {
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
   public tn a() {
      return c;
   }
}
