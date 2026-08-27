import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class euh extends eug {
   private static final Logger b = LogUtils.getLogger();
   private static final vf c = vf.c("mco.configure.world.opening");
   private final erg d;
   private final fcz e;
   private final boolean f;
   private final evg g;

   public euh(erg $$0, fcz $$1, boolean $$2, evg $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      eqp $$0 = eqp.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof esp) {
                     ((esp)this.e).e();
                  }

                  this.d.e = erg.c.b;
                  if (this.f) {
                     eqk.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (esd var4) {
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
   public vf a() {
      return c;
   }
}
