import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eqp extends eqo {
   private static final Logger b = LogUtils.getLogger();
   private static final ui c = ui.c("mco.configure.world.opening");
   private final eno d;
   private final ezd e;
   private final boolean f;
   private final ero g;

   public eqp(eno $$0, ezd $$1, boolean $$2, ero $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      emx $$0 = emx.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof eox) {
                     ((eox)this.e).e();
                  }

                  this.d.e = eno.c.b;
                  if (this.f) {
                     ems.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (eol var4) {
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
   public ui a() {
      return c;
   }
}
