import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epw extends epq {
   private static final Logger b = LogUtils.getLogger();
   private static final ti c = ti.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final eni e;
   private final eoa f;

   public epw(long $$0, eni $$1, eoa $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ema $$0 = ema.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (eno var4) {
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
   public ti a() {
      return c;
   }
}
