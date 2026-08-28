import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fjc extends fiw {
   private static final Logger b = LogUtils.getLogger();
   private static final xl c = xl.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fgq e;
   private final fhj f;

   public fjc(long $$0, fgq $$1, fhj $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      ffa $$0 = ffa.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fgw var4) {
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
