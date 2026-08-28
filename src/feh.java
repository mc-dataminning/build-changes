import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class feh extends fea {
   private static final Logger b = LogUtils.getLogger();
   private static final xl c = xl.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fbr e;
   private final fcj f;

   public feh(long $$0, fbr $$1, fcj $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      faj $$0 = faj.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fbx var4) {
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
   public xl a() {
      return c;
   }
}
