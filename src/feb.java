import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class feb extends feg {
   private static final Logger b = LogUtils.getLogger();
   private static final xp c = xp.c("mco.configure.world.closing");
   private final fbg d;
   private final fcp e;

   public feb(fbg $$0, fcp $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fap $$0 = fap.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = fbg.c.a;
               a(this.e);
               break;
            }
         } catch (fcd var4) {
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
   public xp a() {
      return c;
   }
}
