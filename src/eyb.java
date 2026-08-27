import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eyb extends eyg {
   private static final Logger b = LogUtils.getLogger();
   private static final vu c = vu.c("mco.configure.world.closing");
   private final evg d;
   private final ewp e;

   public eyb(evg $$0, ewp $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      eup $$0 = eup.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.a);
            if ($$2) {
               this.e.b();
               this.d.e = evg.c.a;
               a(this.e);
               break;
            }
         } catch (ewd var4) {
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
   public vu a() {
      return c;
   }
}
