import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fhe extends fhj {
   private static final Logger b = LogUtils.getLogger();
   private static final xd c = xd.c("mco.configure.world.closing");
   private final fel d;
   private final fft e;

   public fhe(fel $$0, fft $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fdu $$0 = fdu.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fel.c.a;
               a(this.e);
               break;
            }
         } catch (ffg var4) {
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
   public xd a() {
      return c;
   }
}
