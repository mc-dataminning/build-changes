import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eun extends euh {
   private static final Logger b = LogUtils.getLogger();
   private static final vf c = vf.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final ery e;
   private final esq f;

   public eun(long $$0, ery $$1, esq $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      eqq $$0 = eqq.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (ese var4) {
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
