import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fel extends fee {
   private static final Logger b = LogUtils.getLogger();
   private static final xo c = xo.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fbv e;
   private final fcn f;

   public fel(long $$0, fbv $$1, fcn $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fan $$0 = fan.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fcb var4) {
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
   public xo a() {
      return c;
   }
}
