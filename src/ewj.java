import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ewj extends ewo {
   private static final Logger b = LogUtils.getLogger();
   private static final vq c = vq.c("mco.configure.world.closing");
   private final eto d;
   private final eux e;

   public ewj(eto $$0, eux $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      esx $$0 = esx.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = eto.c.a;
               a(this.e);
               break;
            }
         } catch (eul var4) {
            if (this.d()) {
               return;
            }

            a((long)var4.c);
         } catch (Exception var5) {
            if (this.d()) {
               return;
            }

            b.error("Failed to close server", var5);
            this.a(var5);
         }
      }
   }

   @Override
   public vq a() {
      return c;
   }
}
