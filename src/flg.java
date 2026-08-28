import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class flg extends flf {
   private static final Logger b = LogUtils.getLogger();
   private static final xv c = xv.c("mco.configure.world.opening");
   private final fij d;
   private final fty e;
   private final boolean f;
   private final fmg g;

   public flg(fij $$0, fty $$1, boolean $$2, fmg $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fhi $$0 = fhi.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fjs) {
                     ((fjs)this.e).f();
                  }

                  this.d.e = fij.c.b;
                  if (this.f) {
                     fhd.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fjf var4) {
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
   public xv a() {
      return c;
   }
}
