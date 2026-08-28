import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffs extends ffl {
   private static final Logger b = LogUtils.getLogger();
   private static final wz c = wz.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fdc e;
   private final fdv f;

   public ffs(long $$0, fdc $$1, fdv $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fbw $$0 = fbw.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fdi var4) {
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
   public wz a() {
      return c;
   }
}
