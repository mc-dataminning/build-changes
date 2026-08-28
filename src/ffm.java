import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffm extends ffl {
   private static final Logger b = LogUtils.getLogger();
   private static final wz c = wz.c("mco.configure.world.opening");
   private final fcn d;
   private final fob e;
   private final boolean f;
   private final fgm g;

   public ffm(fcn $$0, fob $$1, boolean $$2, fgm $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fbw $$0 = fbw.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fdv) {
                     ((fdv)this.e).f();
                  }

                  this.d.e = fcn.c.b;
                  if (this.f) {
                     fbr.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fdi var4) {
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
   public wz a() {
      return c;
   }
}
