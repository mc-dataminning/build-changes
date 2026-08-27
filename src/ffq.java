import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffq extends ffj {
   private static final Logger b = LogUtils.getLogger();
   private static final xe c = xe.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fda e;
   private final fds f;

   public ffq(long $$0, fda $$1, fds $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fbs $$0 = fbs.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fdg var4) {
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
   public xe a() {
      return c;
   }
}
