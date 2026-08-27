import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class faz extends fay {
   private static final Logger b = LogUtils.getLogger();
   private static final wi c = wi.c("mco.configure.world.opening");
   private final exy d;
   private final fjx e;
   private final boolean f;
   private final fby g;

   public faz(exy $$0, fjx $$1, boolean $$2, fby $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      exh $$0 = exh.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof ezh) {
                     ((ezh)this.e).b();
                  }

                  this.d.e = exy.c.b;
                  if (this.f) {
                     exc.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (eyv var4) {
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
   public wi a() {
      return c;
   }
}
