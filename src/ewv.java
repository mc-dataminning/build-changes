import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ewv extends ewo {
   private static final Logger b = LogUtils.getLogger();
   private static final vq c = vq.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final euf e;
   private final eux f;

   public ewv(long $$0, euf $$1, eux $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      esx $$0 = esx.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (eul var4) {
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
   public vq a() {
      return c;
   }
}
