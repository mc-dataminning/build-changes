import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fko extends fkh {
   private static final Logger b = LogUtils.getLogger();
   private static final wo c = wo.c("mco.minigame.world.slot.screen.title");
   private final long d;
   private final int e;
   private final Runnable f;

   public fko(long $$0, int $$1, Runnable $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fgk $$0 = fgk.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.a(this.d, this.e)) {
               this.f.run();
               break;
            }
         } catch (fih var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
         } catch (Exception var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't switch world!");
            this.a(var5);
         }
      }
   }

   @Override
   public wo a() {
      return c;
   }
}
