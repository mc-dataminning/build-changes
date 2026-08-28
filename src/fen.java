import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fen extends feg {
   private static final Logger b = LogUtils.getLogger();
   private static final xp c = xp.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fbx e;
   private final fcp f;

   public fen(long $$0, fbx $$1, fcp $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fap $$0 = fap.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fcd var4) {
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
   public xp a() {
      return c;
   }
}
