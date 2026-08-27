import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eph extends epl {
   private static final Logger c = LogUtils.getLogger();
   private final emm d;
   private final enw e;

   public eph(emm $$0, enw $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      this.b(tf.c("mco.configure.world.closing"));
      elv $$0 = elv.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.c()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = emm.b.a;
               a(this.e);
               break;
            }
         } catch (enj var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.c);
         } catch (Exception var5) {
            if (this.c()) {
               return;
            }

            c.error("Failed to close server", var5);
            this.a(var5);
         }
      }
   }
}
