import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eux extends eur {
   private static final Logger b = LogUtils.getLogger();
   private static final vg c = vg.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final esi e;
   private final eta f;

   public eux(long $$0, esi $$1, eta $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      era $$0 = era.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (eso var4) {
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
   public vg a() {
      return c;
   }
}
