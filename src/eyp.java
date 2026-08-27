import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eyp extends eyi {
   private static final Logger b = LogUtils.getLogger();
   private static final vu c = vu.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final evz e;
   private final ewr f;

   public eyp(long $$0, evz $$1, ewr $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      eur $$0 = eur.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (ewf var4) {
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
   public vu a() {
      return c;
   }
}
