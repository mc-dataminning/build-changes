import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class equ extends eqo {
   private static final Logger b = LogUtils.getLogger();
   private static final ui c = ui.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final eof e;
   private final eox f;

   public equ(long $$0, eof $$1, eox $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      emx $$0 = emx.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (eol var4) {
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
   public ui a() {
      return c;
   }
}
