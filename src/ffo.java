import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffo extends ffh {
   private static final Logger b = LogUtils.getLogger();
   private static final wy c = wy.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fcy e;
   private final fdr f;

   public ffo(long $$0, fcy $$1, fdr $$2) {
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
         } catch (fde var4) {
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
   public wy a() {
      return c;
   }
}
