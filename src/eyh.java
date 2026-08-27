import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eyh extends eyg {
   private static final Logger b = LogUtils.getLogger();
   private static final vu c = vu.c("mco.configure.world.opening");
   private final evg d;
   private final fhf e;
   private final boolean f;
   private final ezg g;

   public eyh(evg $$0, fhf $$1, boolean $$2, ezg $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      eup $$0 = eup.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.a);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof ewp) {
                     ((ewp)this.e).b();
                  }

                  this.d.e = evg.c.b;
                  if (this.f) {
                     euk.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
               break;
            }
         } catch (ewd var4) {
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
   public vu a() {
      return c;
   }
}
