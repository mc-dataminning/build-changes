import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ewi extends ewh {
   private static final Logger b = LogUtils.getLogger();
   private static final vq c = vq.c("mco.configure.world.opening");
   private final eth d;
   private final ffe e;
   private final boolean f;
   private final exh g;

   public ewi(eth $$0, ffe $$1, boolean $$2, exh $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      esq $$0 = esq.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof euq) {
                     ((euq)this.e).b();
                  }

                  this.d.e = eth.c.b;
                  if (this.f) {
                     esl.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (eue var4) {
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
   public vq a() {
      return c;
   }
}
