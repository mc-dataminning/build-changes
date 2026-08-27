import com.mojang.serialization.Codec;

public class dvx extends dvq<dyb> {
   public dvx(Codec<dyb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dyb> $$0) {
      cxu $$1 = $$0.b();
      ib $$2 = $$0.e();
      axd $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dmz $$4 = $$1.a_($$2.c());
         if (!$$4.a(dac.dV) && !$$4.a(dac.dY) && !$$4.a(dac.pr)) {
            return false;
         } else {
            $$1.a($$2, dac.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               ib $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ih $$8 : ih.values()) {
                     if ($$1.a_($$6.a($$8)).a(dac.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dac.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
