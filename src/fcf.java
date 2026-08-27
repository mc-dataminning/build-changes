import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fcf extends fce {
   private static final Logger b = LogUtils.getLogger();
   private static final wu c = wu.c("mco.configure.world.opening");
   private final eze d;
   private final fld e;
   private final boolean f;
   private final fde g;

   public fcf(eze $$0, fld $$1, boolean $$2, fde $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      eyn $$0 = eyn.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fan) {
                     ((fan)this.e).b();
                  }

                  this.d.e = eze.c.b;
                  if (this.f) {
                     eyi.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (fab var4) {
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
