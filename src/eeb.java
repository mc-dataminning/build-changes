import com.mojang.serialization.Codec;

public class eeb extends edu<egf> {
   public eeb(Codec<egf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egf> $$0) {
      dfg $$1 = $$0.b();
      jf $$2 = $$0.e();
      azn $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dus $$4 = $$1.a_($$2.d());
         if (!$$4.a(dho.dV) && !$$4.a(dho.dY) && !$$4.a(dho.pr)) {
            return false;
         } else {
            $$1.a($$2, dho.ec.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               jf $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jk $$8 : jk.values()) {
                     if ($$1.a_($$6.a($$8)).a(dho.ec)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dho.ec.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
