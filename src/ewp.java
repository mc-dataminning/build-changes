import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ewp extends ewh {
   private static final Logger b = LogUtils.getLogger();
   private static final vq c = vq.c("mco.minigame.world.slot.screen.title");
   private final long d;
   private final int e;
   private final Runnable f;

   public ewp(long $$0, int $$1, Runnable $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      esq $$0 = esq.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.a(this.d, this.e)) {
               this.f.run();
               break;
            }
         } catch (eue var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
         } catch (Exception var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't switch world!");
            this.a(var5);
         }
      }
   }

   @Override
   public vq a() {
      return c;
   }
}
