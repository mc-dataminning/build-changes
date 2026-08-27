import com.mojang.serialization.Codec;

public class dsj extends dsc<dun> {
   public dsj(Codec<dun> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<dun> $$0) {
      cus $$1 = $$0.b();
      hx $$2 = $$0.e();
      auw $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         djp $$4 = $$1.a_($$2.c());
         if (!$$4.a(cxa.dV) && !$$4.a(cxa.dY) && !$$4.a(cxa.pr)) {
            return false;
         } else {
            $$1.a($$2, cxa.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               hx $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ic $$8 : ic.values()) {
                     if ($$1.a_($$6.a($$8)).a(cxa.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, cxa.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
