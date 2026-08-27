import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffe extends ffj {
   private static final Logger b = LogUtils.getLogger();
   private static final xe c = xe.c("mco.configure.world.closing");
   private final fcj d;
   private final fds e;

   public ffe(fcj $$0, fds $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fbs $$0 = fbs.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = fcj.c.a;
               a(this.e);
               break;
            }
         } catch (fdg var4) {
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
   public xe a() {
      return c;
   }
}
