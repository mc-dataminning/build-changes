import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fcb extends fbu {
   private static final Logger b = LogUtils.getLogger();
   private static final ws c = ws.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final ezl e;
   private final fad f;

   public fcb(long $$0, ezl $$1, fad $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      eyd $$0 = eyd.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (ezr var4) {
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
   public ws a() {
      return c;
   }
}
