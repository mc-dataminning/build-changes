import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fqe extends fqd {
   private static final Logger b = LogUtils.getLogger();
   private static final xc c = xc.c("mco.configure.world.opening");
   private final fng d;
   private final gaf e;
   private final boolean f;
   private final frf g;

   public fqe(fng $$0, gaf $$1, boolean $$2, frf $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fmf $$0 = fmf.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fop) {
                     ((fop)this.e).f();
                  }

                  this.d.e = fng.c.b;
                  if (this.f) {
                     fma.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (foc var4) {
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
   public xc a() {
      return c;
   }
}
