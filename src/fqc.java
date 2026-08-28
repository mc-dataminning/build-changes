import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fqc extends fqb {
   private static final Logger b = LogUtils.getLogger();
   private static final xa c = xa.c("mco.configure.world.opening");
   private final fne d;
   private final gad e;
   private final boolean f;
   private final frd g;

   public fqc(fne $$0, gad $$1, boolean $$2, frd $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fmd $$0 = fmd.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fon) {
                     ((fon)this.e).f();
                  }

                  this.d.e = fne.c.b;
                  if (this.f) {
                     fly.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (foa var4) {
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
   public xa a() {
      return c;
   }
}
