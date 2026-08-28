import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fnl extends fnp {
   private static final Logger b = LogUtils.getLogger();
   private static final wy c = wy.c("mco.configure.world.closing");
   private final fkt d;
   private final fmc e;

   public fnl(fkt $$0, fmc $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      fjs $$0 = fjs.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.f();
               this.d.e = fkt.c.a;
               a(this.e);
               break;
            }
         } catch (flp var4) {
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
   public wy a() {
      return c;
   }
}
