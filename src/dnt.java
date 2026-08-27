import com.mojang.serialization.Codec;

public class dnt extends dnm<dpx> {
   public dnt(Codec<dpx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dpx> $$0) {
      cqf $$1 = $$0.b();
      gu $$2 = $$0.e();
      aru $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dez $$4 = $$1.a_($$2.c());
         if (!$$4.a(csm.dW) && !$$4.a(csm.dZ) && !$$4.a(csm.pr)) {
            return false;
         } else {
            $$1.a($$2, csm.ed.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               gu $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (ha $$8 : ha.values()) {
                     if ($$1.a_($$6.a($$8)).a(csm.ed)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, csm.ed.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
