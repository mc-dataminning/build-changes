import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fne extends fnd {
   private static final Logger b = LogUtils.getLogger();
   private static final ww c = ww.c("mco.configure.world.opening");
   private final fkh d;
   private final fxi e;
   private final boolean f;
   private final fof g;

   public fne(fkh $$0, fxi $$1, boolean $$2, fof $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fjg $$0 = fjg.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof flq) {
                     ((flq)this.e).f();
                  }

                  this.d.e = fkh.c.b;
                  if (this.f) {
                     fjb.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fld var4) {
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
   public ww a() {
      return c;
   }
}
