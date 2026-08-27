import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class etq extends etk {
   private static final Logger b = LogUtils.getLogger();
   private static final vb c = vb.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final erb e;
   private final ert f;

   public etq(long $$0, erb $$1, ert $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ept $$0 = ept.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (erh var4) {
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
   public vb a() {
      return c;
   }
}
