import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class feo extends fen {
   private static final Logger b = LogUtils.getLogger();
   private static final wu c = wu.c("mco.configure.world.opening");
   private final fbn d;
   private final fnd e;
   private final boolean f;
   private final ffn g;

   public feo(fbn $$0, fnd $$1, boolean $$2, ffn $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      faw $$0 = faw.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fcx) {
                     ((fcx)this.e).f();
                  }

                  this.d.e = fbn.c.b;
                  if (this.f) {
                     far.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fck var4) {
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
   public wu a() {
      return c;
   }
}
