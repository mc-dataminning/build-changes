import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epm extends epq {
   private static final Logger b = LogUtils.getLogger();
   private static final ti c = ti.c("mco.configure.world.closing");
   private final emr d;
   private final eoa e;

   public epm(emr $$0, eoa $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      ema $$0 = ema.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.e();
               this.d.e = emr.b.a;
               a(this.e);
               break;
            }
         } catch (eno var4) {
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
   public ti a() {
      return c;
   }
}
