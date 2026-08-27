import com.mojang.serialization.Codec;

public class dlu extends dko<dnc> {
   public dlu(Codec<dnc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dnc> $$0) {
      boolean $$1 = false;
      apf $$2 = $$0.d();
      cng $$3 = $$0.b();
      gu $$4 = $$0.e();
      dnc $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dhk.a.d, $$4.u() + $$6, $$4.w() + $$7);
      gu $$9 = new gu($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(cpo.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dcb $$11 = $$10 ? cpo.bx.n() : cpo.bw.n();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dcb $$12 = $$11.a(cxu.b, dcx.a);
               gu $$13 = $$9.c();
               if ($$3.a_($$13).a(cpo.G)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
