import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epn extends epm {
   private static final Logger c = LogUtils.getLogger();
   private final emn d;
   private final exz e;
   private final boolean f;
   private final elr g;
   private final eqm h;

   public epn(emn $$0, exz $$1, elr $$2, boolean $$3, eqm $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
      this.h = $$4;
   }

   @Override
   public void run() {
      this.b(tf.c("mco.configure.world.opening"));
      elw $$0 = elw.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.c()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.h.execute(() -> {
                  if (this.e instanceof enx) {
                     ((enx)this.e).d();
                  }

                  this.d.e = emn.b.b;
                  if (this.f) {
                     this.g.a(this.d, this.e);
                  } else {
                     this.h.a(this.e);
                  }
               });
               break;
            }
         } catch (enk var4) {
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
