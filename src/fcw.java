import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fcw extends fdb {
   private static final Logger b = LogUtils.getLogger();
   private static final wx c = wx.c("mco.configure.world.closing");
   private final fab d;
   private final fbk e;

   public fcw(fab $$0, fbk $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      ezk $$0 = ezk.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = fab.c.a;
               a(this.e);
               break;
            }
         } catch (fay var4) {
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
   public wx a() {
      return c;
   }
}
