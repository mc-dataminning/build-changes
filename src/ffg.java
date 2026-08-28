import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffg extends ffl {
   private static final Logger b = LogUtils.getLogger();
   private static final wz c = wz.c("mco.configure.world.closing");
   private final fcn d;
   private final fdv e;

   public ffg(fcn $$0, fdv $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fbw $$0 = fbw.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fcn.c.a;
               a(this.e);
               break;
            }
         } catch (fdi var4) {
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
