import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class feg extends fef {
   private static final Logger b = LogUtils.getLogger();
   private static final xp c = xp.c("mco.configure.world.opening");
   private final fbf d;
   private final fnd e;
   private final boolean f;
   private final fff g;

   public feg(fbf $$0, fnd $$1, boolean $$2, fff $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fao $$0 = fao.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fco) {
                     ((fco)this.e).b();
                  }

                  this.d.e = fbf.c.b;
                  if (this.f) {
                     faj.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fcc var4) {
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
