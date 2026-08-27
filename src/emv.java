import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emv extends emo {
   private static final Logger c = LogUtils.getLogger();
   private final long d;
   private final int e;
   private final Runnable f;

   public emv(long $$0, int $$1, Runnable $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      eiz $$0 = eiz.a();
      this.b(sw.c("mco.minigame.world.slot.screen.title"));

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.c()) {
               return;
            }

            if ($$0.a(this.d, this.e)) {
               this.f.run();
               break;
            }
         } catch (ekn var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.e);
         } catch (Exception var5) {
            if (this.c()) {
               return;
            }

            c.error("Couldn't switch world!");
            this.a(var5.toString());
         }
      }
   }
}
