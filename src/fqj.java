import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fqj extends fqd {
   private static final Logger b = LogUtils.getLogger();
   private static final xc c = xc.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fnw e;
   private final fop f;

   public fqj(long $$0, fnw $$1, fop $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fmf $$0 = fmf.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (foc var4) {
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
   public xc a() {
      return c;
   }
}
