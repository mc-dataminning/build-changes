import com.mojang.serialization.Codec;

public class doq extends dnl<dpk> {
   public doq(Codec<dpk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpk> $$0) {
      int $$1 = 0;
      art $$2 = $$0.d();
      cqe $$3 = $$0.b();
      gv $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dkh.a.d, $$4.u() + $$7, $$4.w() + $$8);
         gv $$10 = new gv($$4.u() + $$7, $$9, $$4.w() + $$8);
         dey $$11 = csl.mV.n().a(czh.b, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(csl.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
