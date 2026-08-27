import com.mojang.serialization.Codec;

public class dov extends dnm<dpx> {
   public dov(Codec<dpx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dpx> $$0) {
      cqf $$1 = $$0.b();
      gu $$2 = $$0.e();
      gu.a $$3 = new gu.a();
      gu.a $$4 = new gu.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dki.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(ha.a, 1);
            cqj $$10 = $$1.s($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, csm.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, csm.dN.n(), 2);
               dez $$11 = $$1.a_($$4);
               if ($$11.b(czv.a)) {
                  $$1.a($$4, $$11.a(czv.a, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
