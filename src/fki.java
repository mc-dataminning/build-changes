import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fki extends fkh {
   private static final Logger b = LogUtils.getLogger();
   private static final wo c = wo.c("mco.configure.world.opening");
   private final fhl d;
   private final fuk e;
   private final boolean f;
   private final flj g;

   public fki(fhl $$0, fuk $$1, boolean $$2, flj $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fgk $$0 = fgk.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fiu) {
                     ((fiu)this.e).f();
                  }

                  this.d.e = fhl.c.b;
                  if (this.f) {
                     fgf.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fih var4) {
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
   public wo a() {
      return c;
   }
}
