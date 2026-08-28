import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fnv extends fnp {
   private static final Logger b = LogUtils.getLogger();
   private static final wy c = wy.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final flj e;
   private final fmc f;

   public fnv(long $$0, flj $$1, fmc $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fjs $$0 = fjs.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (flp var4) {
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
