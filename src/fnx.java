import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fnx extends fnw {
   private static final Logger b = LogUtils.getLogger();
   private static final wy c = wy.c("mco.configure.world.opening");
   private final fla d;
   private final fyb e;
   private final boolean f;
   private final foz g;

   public fnx(fla $$0, fyb $$1, boolean $$2, foz $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fjz $$0 = fjz.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fmj) {
                     ((fmj)this.e).f();
                  }

                  this.d.e = fla.c.b;
                  if (this.f) {
                     fju.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (flw var4) {
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
   public wy a() {
      return c;
   }
}
