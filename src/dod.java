import com.mojang.serialization.Codec;

public class dod extends dnw<dqh> {
   public dod(Codec<dqh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqh> $$0) {
      cqp $$1 = $$0.b();
      gw $$2 = $$0.e();
      asc $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dfj $$4 = $$1.a_($$2.c());
         if (!$$4.a(csw.dW) && !$$4.a(csw.dZ) && !$$4.a(csw.pr)) {
            return false;
         } else {
            $$1.a($$2, csw.ed.n(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               gw $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).i()) {
                  int $$7 = 0;

                  for (hc $$8 : hc.values()) {
                     if ($$1.a_($$6.a($$8)).a(csw.ed)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, csw.ed.n(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
