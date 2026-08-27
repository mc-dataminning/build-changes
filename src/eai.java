import com.mojang.serialization.Codec;

public class eai extends dzd<ebc> {
   public eai(Codec<ebc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebc> $$0) {
      int $$1 = 0;
      ayg $$2 = $$0.d();
      day $$3 = $$0.b();
      in $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dvz.a.d, $$4.u() + $$7, $$4.w() + $$8);
         in $$10 = new in($$4.u() + $$7, $$9, $$4.w() + $$8);
         dqh $$11 = ddg.mV.n().a(dkb.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(ddg.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
