import com.mojang.serialization.Codec;

public class edf extends eca<edz> {
   public edf(Codec<edz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<edz> $$0) {
      int $$1 = 0;
      ayv $$2 = $$0.d();
      ddq $$3 = $$0.b();
      jd $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dyv.a.d, $$4.u() + $$7, $$4.w() + $$8);
         jd $$10 = new jd($$4.u() + $$7, $$9, $$4.w() + $$8);
         dta $$11 = dfy.mV.o().a(dmu.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dfy.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
