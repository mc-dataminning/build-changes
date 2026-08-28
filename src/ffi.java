import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffi extends ffn {
   private static final Logger b = LogUtils.getLogger();
   private static final wz c = wz.c("mco.configure.world.closing");
   private final fcp d;
   private final fdx e;

   public ffi(fcp $$0, fdx $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fby $$0 = fby.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fcp.c.a;
               a(this.e);
               break;
            }
         } catch (fdk var4) {
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
   public wz a() {
      return c;
   }
}
