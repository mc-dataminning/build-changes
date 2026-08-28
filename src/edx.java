import com.mojang.serialization.Codec;

public class edx extends edq<egb> {
   public edx(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egb> $$0) {
      dfd $$1 = $$0.b();
      je $$2 = $$0.e();
      azl $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         duo $$4 = $$1.a_($$2.d());
         if (!$$4.a(dhl.dV) && !$$4.a(dhl.dY) && !$$4.a(dhl.pr)) {
            return false;
         } else {
            $$1.a($$2, dhl.ec.o(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               je $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jj $$8 : jj.values()) {
                     if ($$1.a_($$6.a($$8)).a(dhl.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dhl.ec.o(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
