import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fjj extends fjd {
   private static final Logger b = LogUtils.getLogger();
   private static final xj c = xj.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fgx e;
   private final fhq f;

   public fjj(long $$0, fgx $$1, fhq $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ffh $$0 = ffh.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fhd var4) {
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
   public xj a() {
      return c;
   }
}
