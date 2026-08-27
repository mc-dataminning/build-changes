import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class etl extends etk {
   private static final Logger b = LogUtils.getLogger();
   private static final vb c = vb.c("mco.configure.world.opening");
   private final eqk d;
   private final fcc e;
   private final boolean f;
   private final euk g;

   public etl(eqk $$0, fcc $$1, boolean $$2, euk $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      ept $$0 = ept.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof ert) {
                     ((ert)this.e).e();
                  }

                  this.d.e = eqk.c.b;
                  if (this.f) {
                     epo.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (erh var4) {
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
   public vb a() {
      return c;
   }
}
