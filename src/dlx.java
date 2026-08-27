import com.mojang.serialization.Codec;

public class dlx extends dko<dmz> {
   public dlx(Codec<dmz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmz> $$0) {
      cng $$1 = $$0.b();
      gu $$2 = $$0.e();
      gu.a $$3 = new gu.a();
      gu.a $$4 = new gu.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(dhk.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(ha.a, 1);
            cnk $$10 = $$1.s($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, cpo.dO.n(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, cpo.dN.n(), 2);
               dcb $$11 = $$1.a_($$4);
               if ($$11.b(cwx.a)) {
                  $$1.a($$4, $$11.a(cwx.a, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
