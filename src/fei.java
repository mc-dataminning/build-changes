import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fei extends feh {
   private static final Logger b = LogUtils.getLogger();
   private static final xp c = xp.c("mco.configure.world.opening");
   private final fbh d;
   private final fnf e;
   private final boolean f;
   private final ffh g;

   public fei(fbh $$0, fnf $$1, boolean $$2, ffh $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      faq $$0 = faq.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fcq) {
                     ((fcq)this.e).b();
                  }

                  this.d.e = fbh.c.b;
                  if (this.f) {
                     fal.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fce var4) {
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
   public xp a() {
      return c;
   }
}
