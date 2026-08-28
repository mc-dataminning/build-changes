import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fha extends fgz {
   private static final Logger b = LogUtils.getLogger();
   private static final xd c = xd.c("mco.configure.world.opening");
   private final feb d;
   private final fpt e;
   private final boolean f;
   private final fib g;

   public fha(feb $$0, fpt $$1, boolean $$2, fib $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fdk $$0 = fdk.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof ffj) {
                     ((ffj)this.e).f();
                  }

                  this.d.e = feb.c.b;
                  if (this.f) {
                     fdf.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (few var4) {
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
   public xd a() {
      return c;
   }
}
