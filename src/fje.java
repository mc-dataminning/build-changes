import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fje extends fjd {
   private static final Logger b = LogUtils.getLogger();
   private static final xj c = xj.c("mco.configure.world.opening");
   private final fgi d;
   private final frw e;
   private final boolean f;
   private final fke g;

   public fje(fgi $$0, frw $$1, boolean $$2, fke $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      ffh $$0 = ffh.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fhq) {
                     ((fhq)this.e).f();
                  }

                  this.d.e = fgi.c.b;
                  if (this.f) {
                     ffc.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fhd var4) {
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
   public xj a() {
      return c;
   }
}
