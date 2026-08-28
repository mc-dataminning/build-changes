import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffa extends fet {
   private static final Logger b = LogUtils.getLogger();
   private static final wu c = wu.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fck e;
   private final fdd f;

   public ffa(long $$0, fck $$1, fdd $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      fbc $$0 = fbc.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (fcq var4) {
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
   public wu a() {
      return c;
   }
}
