import com.mojang.serialization.Codec;

public class ech extends eca<eel> {
   public ech(Codec<eel> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eel> $$0) {
      ddq $$1 = $$0.b();
      jd $$2 = $$0.e();
      ayv $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dta $$4 = $$1.a_($$2.c());
         if (!$$4.a(dfy.dV) && !$$4.a(dfy.dY) && !$$4.a(dfy.pr)) {
            return false;
         } else {
            $$1.a($$2, dfy.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               jd $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ji $$8 : ji.values()) {
                     if ($$1.a_($$6.a($$8)).a(dfy.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dfy.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
