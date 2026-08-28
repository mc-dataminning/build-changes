import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fkg extends fkf {
   private static final Logger b = LogUtils.getLogger();
   private static final wo c = wo.c("mco.configure.world.opening");
   private final fhj d;
   private final fui e;
   private final boolean f;
   private final flh g;

   public fkg(fhj $$0, fui $$1, boolean $$2, flh $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fgi $$0 = fgi.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fis) {
                     ((fis)this.e).f();
                  }

                  this.d.e = fhj.c.b;
                  if (this.f) {
                     fgd.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fif var4) {
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
   public wo a() {
      return c;
   }
}
