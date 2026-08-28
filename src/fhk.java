import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fhk extends fhj {
   private static final Logger b = LogUtils.getLogger();
   private static final xd c = xd.c("mco.configure.world.opening");
   private final fel d;
   private final fqd e;
   private final boolean f;
   private final fil g;

   public fhk(fel $$0, fqd $$1, boolean $$2, fil $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fdu $$0 = fdu.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fft) {
                     ((fft)this.e).f();
                  }

                  this.d.e = fel.c.b;
                  if (this.f) {
                     fdp.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (ffg var4) {
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
   public xd a() {
      return c;
   }
}
