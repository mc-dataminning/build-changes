import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epm extends epl {
   private static final Logger c = LogUtils.getLogger();
   private final emm d;
   private final eya e;
   private final boolean f;
   private final elq g;
   private final eql h;

   public epm(emm $$0, eya $$1, elq $$2, boolean $$3, eql $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
      this.h = $$4;
   }

   @Override
   public void run() {
      this.b(tf.c("mco.configure.world.opening"));
      elv $$0 = elv.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.c()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.h.execute(() -> {
                  if (this.e instanceof enw) {
                     ((enw)this.e).f();
                  }

                  this.d.e = emm.b.b;
                  if (this.f) {
                     this.g.a(this.d, this.e);
                  } else {
                     this.h.a(this.e);
                  }
               });
               break;
            }
         } catch (enj var4) {
            if (this.c()) {
               return;
            }

            a((long)var4.c);
         } catch (Exception var5) {
            if (this.c()) {
               return;
            }

            c.error("Failed to open server", var5);
            this.a(var5);
         }
      }
   }
}
