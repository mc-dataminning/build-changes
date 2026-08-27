import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fda extends fcz {
   private static final Logger b = LogUtils.getLogger();
   private static final wx c = wx.c("mco.configure.world.opening");
   private final ezz d;
   private final fly e;
   private final boolean f;
   private final fdz g;

   public fda(ezz $$0, fly $$1, boolean $$2, fdz $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      ezi $$0 = ezi.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fbi) {
                     ((fbi)this.e).b();
                  }

                  this.d.e = ezz.c.b;
                  if (this.f) {
                     ezd.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (faw var4) {
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
