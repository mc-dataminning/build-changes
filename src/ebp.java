import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class ebp extends eca<eel> {
   public ebp(Codec<eel> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eel> $$0) {
      ayv $$1 = $$0.d();
      ddq $$2 = $$0.b();
      jd $$3 = $$0.e();
      Optional<dfw> $$4 = lt.e.a(awd.aq, $$1).map(jm::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().o());
   }

   protected abstract boolean a(dcv var1, ayv var2, jd var3, dta var4);

   protected boolean b(dcv $$0, ayv $$1, jd $$2, dta $$3) {
      jd $$4 = $$2.c();
      dta $$5 = $$0.a_($$2);
      if (($$5.a(dfy.G) || $$5.a(awd.at)) && $$0.a_($$4).a(dfy.G)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            lt.e.a(awd.at, $$1).map(jm::a).ifPresent($$2x -> $$0.a($$4, $$2x.o(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dfy.mV.o().a(dmu.c, Integer.valueOf($$1.a(4) + 1)), 2);
         }

         for (ji $$6 : ji.c.a) {
            if ($$1.i() < 0.2F) {
               jd $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dfy.G)) {
                  lt.e.a(awd.ar, $$1).map(jm::a).ifPresent($$3x -> {
                     dta $$4x = $$3x.o();
                     if ($$4x.b(dfh.c)) {
                        $$4x = $$4x.a(dfh.c, $$6);
                     }

                     $$0.a($$7, $$4x, 2);
                  });
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
