import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class few extends fev {
   private static final Logger b = LogUtils.getLogger();
   private static final wu c = wu.c("mco.configure.world.opening");
   private final fbv d;
   private final fnl e;
   private final boolean f;
   private final ffw g;

   public few(fbv $$0, fnl $$1, boolean $$2, ffw $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      fbe $$0 = fbe.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fdf) {
                     ((fdf)this.e).f();
                  }

                  this.d.e = fbv.c.b;
                  if (this.f) {
                     faz.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fcs var4) {
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
