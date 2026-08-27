import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epo extends epn {
   private static final Logger c = LogUtils.getLogger();
   private final emo d;
   private final exv e;
   private final boolean f;
   private final els g;
   private final eqn h;

   public epo(emo $$0, exv $$1, els $$2, boolean $$3, eqn $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
      this.h = $$4;
   }

   @Override
   public void run() {
      this.b(te.c("mco.configure.world.opening"));
      elx $$0 = elx.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.c()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.h.execute(() -> {
                  if (this.e instanceof eny) {
                     ((eny)this.e).d();
                  }

                  this.d.e = emo.b.b;
                  if (this.f) {
                     this.g.a(this.d, this.e);
                  } else {
                     this.h.a(this.e);
                  }
               });
               break;
            }
         } catch (enl var4) {
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
