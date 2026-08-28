import com.mojang.serialization.Codec;

public class ekz extends ejt<emh> {
   public ekz(Codec<emh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejv<emh> $$0) {
      boolean $$1 = false;
      azv $$2 = $$0.d();
      dkg $$3 = $$0.b();
      iv $$4 = $$0.e();
      emh $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(egn.a.d, $$4.u() + $$6, $$4.w() + $$7);
      iv $$9 = new iv($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dmo.J)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         eao $$11 = $$10 ? dmo.bH.m() : dmo.bG.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               eao $$12 = $$11.b(dvd.d, ebk.a);
               iv $$13 = $$9.d();
               if ($$3.a_($$13).a(dmo.J)) {
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
