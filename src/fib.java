import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fib extends fig {
   private static final Logger b = LogUtils.getLogger();
   private static final xi c = xi.c("mco.configure.world.closing");
   private final ffi d;
   private final fgq e;

   public fib(ffi $$0, fgq $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fer $$0 = fer.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = ffi.c.a;
               a(this.e);
               break;
            }
         } catch (fgd var4) {
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
   public xi a() {
      return c;
   }
}
