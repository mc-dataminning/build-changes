import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eub extends eua {
   private static final Logger b = LogUtils.getLogger();
   private static final vd c = vd.c("mco.configure.world.opening");
   private final era d;
   private final fct e;
   private final boolean f;
   private final eva g;

   public eub(era $$0, fct $$1, boolean $$2, eva $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      eqj $$0 = eqj.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof esj) {
                     ((esj)this.e).e();
                  }

                  this.d.e = era.c.b;
                  if (this.f) {
                     eqe.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (erx var4) {
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
   public vd a() {
      return c;
   }
}
