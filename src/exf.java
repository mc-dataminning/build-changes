import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class exf extends exk {
   private static final Logger b = LogUtils.getLogger();
   private static final vs c = vs.c("mco.configure.world.closing");
   private final euk d;
   private final evt e;

   public exf(euk $$0, evt $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      ett $$0 = ett.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = euk.c.a;
               a(this.e);
               break;
            }
         } catch (evh var4) {
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
   public vs a() {
      return c;
   }
}
