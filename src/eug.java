import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eug extends eua {
   private static final Logger b = LogUtils.getLogger();
   private static final vd c = vd.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final err e;
   private final esj f;

   public eug(long $$0, err $$1, esj $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      eqj $$0 = eqj.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (erx var4) {
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
   public vd a() {
      return c;
   }
}
