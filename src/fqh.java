import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fqh extends fqb {
   private static final Logger b = LogUtils.getLogger();
   private static final xa c = xa.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fnu e;
   private final fon f;

   public fqh(long $$0, fnu $$1, fon $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fmd $$0 = fmd.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (foa var4) {
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
   public xa a() {
      return c;
   }
}
