import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epl extends epp {
   private static final Logger b = LogUtils.getLogger();
   private static final tl c = tl.c("mco.configure.world.closing");
   private final emq d;
   private final enz e;

   public epl(emq $$0, enz $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      elz $$0 = elz.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.e();
               this.d.e = emq.b.a;
               a(this.e);
               break;
            }
         } catch (enn var4) {
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
   public tl a() {
      return c;
   }
}
