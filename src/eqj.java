import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eqj extends eqo {
   private static final Logger b = LogUtils.getLogger();
   private static final ui c = ui.c("mco.configure.world.closing");
   private final eno d;
   private final eox e;

   public eqj(eno $$0, eox $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      emx $$0 = emx.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.e();
               this.d.e = eno.c.a;
               a(this.e);
               break;
            }
         } catch (eol var4) {
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
   public ui a() {
      return c;
   }
}
