import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class feo extends fet {
   private static final Logger b = LogUtils.getLogger();
   private static final wu c = wu.c("mco.configure.world.closing");
   private final fbt d;
   private final fdd e;

   public feo(fbt $$0, fdd $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fbc $$0 = fbc.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fbt.c.a;
               a(this.e);
               break;
            }
         } catch (fcq var4) {
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
   public wu a() {
      return c;
   }
}
