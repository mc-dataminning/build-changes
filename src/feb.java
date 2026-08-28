import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class feb extends fea {
   private static final Logger b = LogUtils.getLogger();
   private static final xl c = xl.c("mco.configure.world.opening");
   private final fba d;
   private final fmy e;
   private final boolean f;
   private final ffa g;

   public feb(fba $$0, fmy $$1, boolean $$2, ffa $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      faj $$0 = faj.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fcj) {
                     ((fcj)this.e).b();
                  }

                  this.d.e = fba.c.b;
                  if (this.f) {
                     fae.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fbx var4) {
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
   public xl a() {
      return c;
   }
}
