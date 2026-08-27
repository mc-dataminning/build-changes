import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbz extends fce {
   private static final Logger b = LogUtils.getLogger();
   private static final wu c = wu.c("mco.configure.world.closing");
   private final eze d;
   private final fan e;

   public fbz(eze $$0, fan $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      eyn $$0 = eyn.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = eze.c.a;
               a(this.e);
               break;
            }
         } catch (fab var4) {
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
