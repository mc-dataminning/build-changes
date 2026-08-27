import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ept extends epn {
   private static final Logger c = LogUtils.getLogger();
   private final long d;
   private final enf e;
   private final eny f;

   public ept(long $$0, enf $$1, eny $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      elx $$0 = elx.a();
      this.b(te.c("mco.minigame.world.starting.screen.title"));

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.c()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
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

            c.error("Couldn't start mini game!");
            this.a(var5);
         }
      }
   }
}
