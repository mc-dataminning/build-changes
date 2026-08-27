import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epw extends epv {
   private static final Logger b = LogUtils.getLogger();
   private static final tm c = tm.c("mco.configure.world.opening");
   private final emw d;
   private final eyk e;
   private final boolean f;
   private final ema g;
   private final eqv h;

   public epw(emw $$0, eyk $$1, ema $$2, boolean $$3, eqv $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$2;
      this.h = $$4;
   }

   @Override
   public void run() {
      emf $$0 = emf.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.h.execute(() -> {
                  if (this.e instanceof eof) {
                     ((eof)this.e).e();
                  }

                  this.d.e = emw.b.b;
                  if (this.f) {
                     this.g.a(this.d, this.e);
                  } else {
                     this.h.a(this.e);
                  }
               });
               break;
            }
         } catch (ent var4) {
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
   public tm a() {
      return c;
   }
}
