import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fle extends fky {
   private static final Logger b = LogUtils.getLogger();
   private static final xk c = xk.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fis e;
   private final fjl f;

   public fle(long $$0, fis $$1, fjl $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fhb $$0 = fhb.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fiy var4) {
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
   public xk a() {
      return c;
   }
}
