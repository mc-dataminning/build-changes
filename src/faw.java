import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class faw extends fap {
   private static final Logger b = LogUtils.getLogger();
   private static final wg c = wg.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final eyg e;
   private final eyy f;

   public faw(long $$0, eyg $$1, eyy $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ewy $$0 = ewy.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (eym var4) {
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
   public wg a() {
      return c;
   }
}
