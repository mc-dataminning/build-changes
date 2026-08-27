import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epq extends epp {
   private static final Logger b = LogUtils.getLogger();
   private static final tl c = tl.c("mco.configure.world.opening");
   private final emq d;
   private final eye e;
   private final boolean f;
   private final eqp g;

   public epq(emq $$0, eye $$1, boolean $$2, eqp $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      elz $$0 = elz.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof enz) {
                     ((enz)this.e).e();
                  }

                  this.d.e = emq.b.b;
                  if (this.f) {
                     elu.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (enn var4) {
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
   public tl a() {
      return c;
   }
}
