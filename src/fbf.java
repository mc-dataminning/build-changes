import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbf extends fay {
   private static final Logger b = LogUtils.getLogger();
   private static final wi c = wi.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final eyp e;
   private final ezh f;

   public fbf(long $$0, eyp $$1, ezh $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      exh $$0 = exh.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (eyv var4) {
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
   public wi a() {
      return c;
   }
}
