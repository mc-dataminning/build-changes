import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eso extends esi {
   private static final Logger b = LogUtils.getLogger();
   private static final uv c = uv.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final epz e;
   private final eqr f;

   public eso(long $$0, epz $$1, eqr $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      eor $$0 = eor.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (eqf var4) {
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
   public uv a() {
      return c;
   }
}
