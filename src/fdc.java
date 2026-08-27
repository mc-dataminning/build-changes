import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fdc extends fdb {
   private static final Logger b = LogUtils.getLogger();
   private static final wx c = wx.c("mco.configure.world.opening");
   private final fab d;
   private final flz e;
   private final boolean f;
   private final feb g;

   public fdc(fab $$0, flz $$1, boolean $$2, feb $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      ezk $$0 = ezk.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fbk) {
                     ((fbk)this.e).b();
                  }

                  this.d.e = fab.c.b;
                  if (this.f) {
                     ezf.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fay var4) {
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
   public wx a() {
      return c;
   }
}
