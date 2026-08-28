import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffu extends ffn {
   private static final Logger b = LogUtils.getLogger();
   private static final wz c = wz.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fde e;
   private final fdx f;

   public ffu(long $$0, fde $$1, fdx $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fby $$0 = fby.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fdk var4) {
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
   public wz a() {
      return c;
   }
}
