import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epr extends epq {
   private static final Logger b = LogUtils.getLogger();
   private static final ti c = ti.c("mco.configure.world.opening");
   private final emr d;
   private final eyf e;
   private final boolean f;
   private final elv g;
   private final eqq h;

   public epr(emr $$0, eyf $$1, elv $$2, boolean $$3, eqq $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
      this.h = $$4;
   }

   @Override
   public void run() {
      ema $$0 = ema.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.h.execute(() -> {
                  if (this.e instanceof eoa) {
                     ((eoa)this.e).e();
                  }

                  this.d.e = emr.b.b;
                  if (this.f) {
                     this.g.a(this.d, this.e);
                  } else {
                     this.h.a(this.e);
                  }
               });
               break;
            }
         } catch (eno var4) {
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
   public ti a() {
      return c;
   }
}
