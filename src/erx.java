import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class erx extends err {
   private static final Logger b = LogUtils.getLogger();
   private static final ur c = ur.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final epi e;
   private final eqa f;

   public erx(long $$0, epi $$1, eqa $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      eoa $$0 = eoa.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (epo var4) {
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
   public ur a() {
      return c;
   }
}
