import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epu extends epn {
   private static final Logger c = LogUtils.getLogger();
   private final long d;
   private final int e;
   private final Runnable f;

   public epu(long $$0, int $$1, Runnable $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      elx $$0 = elx.a();
      this.b(te.c("mco.minigame.world.slot.screen.title"));

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.c()) {
               return;
            }

            if ($$0.a(this.d, this.e)) {
               this.f.run();
               break;
            }
         } catch (enl var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.c);
         } catch (Exception var5) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't switch world!");
            this.a(var5);
         }
      }
   }
}
