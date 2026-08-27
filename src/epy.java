import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epy extends epx {
   private static final Logger b = LogUtils.getLogger();
   private static final tn c = tn.c("mco.configure.world.opening");
   private final emy d;
   private final eym e;
   private final boolean f;
   private final eqx g;

   public epy(emy $$0, eym $$1, boolean $$2, eqx $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      emh $$0 = emh.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof eoh) {
                     ((eoh)this.e).e();
                  }

                  this.d.e = emy.b.b;
                  if (this.f) {
                     emc.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (env var4) {
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
   public tn a() {
      return c;
   }
}
