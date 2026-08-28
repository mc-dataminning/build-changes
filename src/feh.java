import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class feh extends feg {
   private static final Logger b = LogUtils.getLogger();
   private static final xp c = xp.c("mco.configure.world.opening");
   private final fbg d;
   private final fne e;
   private final boolean f;
   private final ffg g;

   public feh(fbg $$0, fne $$1, boolean $$2, ffg $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fap $$0 = fap.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fcp) {
                     ((fcp)this.e).b();
                  }

                  this.d.e = fbg.c.b;
                  if (this.f) {
                     fak.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
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

            b.error("Failed to open server", var5);
            this.a(var5);
         }
      }
   }

   @Override
   public xp a() {
      return c;
   }
}
