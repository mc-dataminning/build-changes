import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class euo extends eui {
   private static final Logger b = LogUtils.getLogger();
   private static final vf c = vf.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final erz e;
   private final esr f;

   public euo(long $$0, erz $$1, esr $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      eqr $$0 = eqr.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (esf var4) {
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
   public vf a() {
      return c;
   }
}
