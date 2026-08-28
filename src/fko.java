import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fko extends fki {
   private static final Logger b = LogUtils.getLogger();
   private static final wp c = wp.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fic e;
   private final fiv f;

   public fko(long $$0, fic $$1, fiv $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fgl $$0 = fgl.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fii var4) {
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
   public wp a() {
      return c;
   }
}
