import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fkl extends fkf {
   private static final Logger b = LogUtils.getLogger();
   private static final wo c = wo.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fhz e;
   private final fis f;

   public fkl(long $$0, fhz $$1, fis $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fgi $$0 = fgi.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fif var4) {
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
   public wo a() {
      return c;
   }
}
