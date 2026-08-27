import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eyj extends eyi {
   private static final Logger b = LogUtils.getLogger();
   private static final vu c = vu.c("mco.configure.world.opening");
   private final evi d;
   private final fhh e;
   private final boolean f;
   private final ezi g;

   public eyj(evi $$0, fhh $$1, boolean $$2, ezi $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      eur $$0 = eur.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof ewr) {
                     ((ewr)this.e).b();
                  }

                  this.d.e = evi.c.b;
                  if (this.f) {
                     eum.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (ewf var4) {
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
   public vu a() {
      return c;
   }
}
