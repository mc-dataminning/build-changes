import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eqb extends epv {
   private static final Logger b = LogUtils.getLogger();
   private static final tm c = tm.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final enn e;
   private final eof f;

   public eqb(long $$0, enn $$1, eof $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      emf $$0 = emf.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
               break;
            }
         } catch (ent var4) {
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
   public tm a() {
      return c;
   }
}
