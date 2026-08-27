import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epi extends epm {
   private static final Logger c = LogUtils.getLogger();
   private final emn d;
   private final enx e;

   public epi(emn $$0, enx $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      this.b(tf.c("mco.configure.world.closing"));
      elw $$0 = elw.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.c()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.d();
               this.d.e = emn.b.a;
               a(this.e);
               break;
            }
         } catch (enk var4) {
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
