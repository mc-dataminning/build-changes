import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ers extends err {
   private static final Logger b = LogUtils.getLogger();
   private static final ur c = ur.c("mco.configure.world.opening");
   private final eor d;
   private final fah e;
   private final boolean f;
   private final esr g;

   public ers(eor $$0, fah $$1, boolean $$2, esr $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      eoa $$0 = eoa.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof eqa) {
                     ((eqa)this.e).e();
                  }

                  this.d.e = eor.c.b;
                  if (this.f) {
                     env.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (epo var4) {
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
   public ur a() {
      return c;
   }
}
