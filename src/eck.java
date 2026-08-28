import com.mojang.serialization.Codec;

public class eck extends ecd<eeo> {
   public eck(Codec<eeo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<eeo> $$0) {
      dds $$1 = $$0.b();
      jd $$2 = $$0.e();
      ayw $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dtc $$4 = $$1.a_($$2.d());
         if (!$$4.a(dga.dV) && !$$4.a(dga.dY) && !$$4.a(dga.pr)) {
            return false;
         } else {
            $$1.a($$2, dga.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               jd $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ji $$8 : ji.values()) {
                     if ($$1.a_($$6.a($$8)).a(dga.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dga.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
