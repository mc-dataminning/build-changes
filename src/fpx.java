import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fpx extends fqb {
   private static final Logger b = LogUtils.getLogger();
   private static final xa c = xa.c("mco.configure.world.closing");
   private final fne d;
   private final fon e;

   public fpx(fne $$0, fon $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fmd $$0 = fmd.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fne.c.a;
               a(this.e);
               break;
            }
         } catch (foa var4) {
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
   public xa a() {
      return c;
   }
}
