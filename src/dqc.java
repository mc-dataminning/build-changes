import com.mojang.serialization.Codec;

public class dqc extends dpv<dsg> {
   public dqc(Codec<dsg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dpx<dsg> $$0) {
      csu $$1 = $$0.b();
      ht $$2 = $$0.e();
      ats $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dhi $$4 = $$1.a_($$2.c());
         if (!$$4.a(cvc.dV) && !$$4.a(cvc.dY) && !$$4.a(cvc.pr)) {
            return false;
         } else {
            $$1.a($$2, cvc.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               ht $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (hx $$8 : hx.values()) {
                     if ($$1.a_($$6.a($$8)).a(cvc.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cvc.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
