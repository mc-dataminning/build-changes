import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffc extends fev {
   private static final Logger b = LogUtils.getLogger();
   private static final wu c = wu.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fcm e;
   private final fdf f;

   public ffc(long $$0, fcm $$1, fdf $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fbe $$0 = fbe.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fcs var4) {
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
   public wu a() {
      return c;
   }
}
