import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eus extends eur {
   private static final Logger b = LogUtils.getLogger();
   private static final vg c = vg.c("mco.configure.world.opening");
   private final err d;
   private final fdm e;
   private final boolean f;
   private final evr g;

   public eus(err $$0, fdm $$1, boolean $$2, evr $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      era $$0 = era.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof eta) {
                     ((eta)this.e).b();
                  }

                  this.d.e = err.c.b;
                  if (this.f) {
                     eqv.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (eso var4) {
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
   public vg a() {
      return c;
   }
}
