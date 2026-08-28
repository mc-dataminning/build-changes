import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fec extends feh {
   private static final Logger b = LogUtils.getLogger();
   private static final xp c = xp.c("mco.configure.world.closing");
   private final fbh d;
   private final fcq e;

   public fec(fbh $$0, fcq $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      faq $$0 = faq.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = fbh.c.a;
               a(this.e);
               break;
            }
         } catch (fce var4) {
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
