import com.mojang.serialization.Codec;

public class eei extends edu<egf> {
   public eei(Codec<egf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egf> $$0) {
      int $$1 = 0;
      dfg $$2 = $$0.b();
      jf $$3 = $$0.e();
      azn $$4 = $$0.d();
      int $$5 = $$2.a(eao.a.d, $$3.u(), $$3.w());
      jf $$6 = new jf($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dho.G)) {
         dus $$7 = dho.mc.n();
         dus $$8 = dho.md.n();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dho.G) && $$2.a_($$6.d()).a(dho.G) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(dlq.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               jf $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(dho.mc)) {
                  $$2.a($$11, $$7.b(dlq.e, Integer.valueOf($$4.a(4) + 20)), 2);
                  $$1++;
               }
               break;
            }

            $$6 = $$6.d();
         }
      }

      return $$1 > 0;
   }
}
