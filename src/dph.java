import com.mojang.serialization.Codec;

public class dph extends dny<dqj> {
   public dph(Codec<dqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doa<dqj> $$0) {
      cqr $$1 = $$0.b();
      gw $$2 = $$0.e();
      gw.a $$3 = new gw.a();
      gw.a $$4 = new gw.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dku.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(hc.a, 1);
            cqv $$10 = $$1.s($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, csy.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, csy.dN.n(), 2);
               dfl $$11 = $$1.a_($$4);
               if ($$11.b(dah.a)) {
                  $$1.a($$4, $$11.a(dah.a, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
