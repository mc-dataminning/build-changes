import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class esj extends esi {
   private static final Logger b = LogUtils.getLogger();
   private static final uv c = uv.c("mco.configure.world.opening");
   private final epi d;
   private final faz e;
   private final boolean f;
   private final eti g;

   public esj(epi $$0, faz $$1, boolean $$2, eti $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      eor $$0 = eor.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof eqr) {
                     ((eqr)this.e).e();
                  }

                  this.d.e = epi.c.b;
                  if (this.f) {
                     eom.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (eqf var4) {
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
   public uv a() {
      return c;
   }
}
