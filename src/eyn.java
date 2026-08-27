import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eyn extends eyg {
   private static final Logger b = LogUtils.getLogger();
   private static final vu c = vu.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final evx e;
   private final ewp f;

   public eyn(long $$0, evx $$1, ewp $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      eup $$0 = eup.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (ewd var4) {
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
   public vu a() {
      return c;
   }
}
