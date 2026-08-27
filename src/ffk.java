import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ffk extends ffj {
   private static final Logger b = LogUtils.getLogger();
   private static final xe c = xe.c("mco.configure.world.opening");
   private final fcj d;
   private final fon e;
   private final boolean f;
   private final fgj g;

   public ffk(fcj $$0, fon $$1, boolean $$2, fgj $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fbs $$0 = fbs.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fds) {
                     ((fds)this.e).b();
                  }

                  this.d.e = fcj.c.b;
                  if (this.f) {
                     fbn.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fdg var4) {
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
   public xe a() {
      return c;
   }
}
