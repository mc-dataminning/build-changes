import com.mojang.serialization.Codec;

public class dpf extends dnw<dqh> {
   public dpf(Codec<dqh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqh> $$0) {
      cqp $$1 = $$0.b();
      gw $$2 = $$0.e();
      gw.a $$3 = new gw.a();
      gw.a $$4 = new gw.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dks.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(ha.a, 1);
            cqt $$10 = $$1.s($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, csw.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, csw.dN.n(), 2);
               dfj $$11 = $$1.a_($$4);
               if ($$11.b(daf.a)) {
                  $$1.a($$4, $$11.a(daf.a, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
