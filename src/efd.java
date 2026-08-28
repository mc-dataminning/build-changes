import com.mojang.serialization.Codec;

public class efd extends edu<egf> {
   public efd(Codec<egf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egf> $$0) {
      dfg $$1 = $$0.b();
      jf $$2 = $$0.e();
      jf.a $$3 = new jf.a();
      jf.a $$4 = new jf.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(eao.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(jk.a, 1);
            dfk $$10 = $$1.t($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dho.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dho.dN.n(), 2);
               dus $$11 = $$1.a_($$4);
               if ($$11.b(dox.c)) {
                  $$1.a($$4, $$11.b(dox.c, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
