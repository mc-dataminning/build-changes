import com.mojang.serialization.Codec;
import java.util.Optional;

public class dsp extends drt<dug> {
   public dsp(Codec<dug> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<dug> $$0) {
      ctp $$1 = $$0.b();
      hx $$2 = $$0.e();
      auu $$3 = $$0.d();
      dug $$4 = $$0.f();
      Optional<ic> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         hx $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && drp.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         drp.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<ic> a(ctp $$0, hx $$1, auu $$2) {
      boolean $$3 = drp.b($$0.a_($$1.c()));
      boolean $$4 = drp.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? ic.a : ic.b);
      } else if ($$3) {
         return Optional.of(ic.a);
      } else {
         return $$4 ? Optional.of(ic.b) : Optional.empty();
      }
   }

   private static void a(ctp $$0, auu $$1, hx $$2, dug $$3) {
      drp.c($$0, $$2);

      for (ic $$4 : ic.c.a) {
         if (!($$1.i() > $$3.c)) {
            hx $$5 = $$2.a($$4);
            drp.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               hx $$6 = $$5.a(ic.b($$1));
               drp.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  hx $$7 = $$6.a(ic.b($$1));
                  drp.c($$0, $$7);
               }
            }
         }
      }
   }
}
