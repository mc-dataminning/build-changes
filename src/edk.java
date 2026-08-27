import com.mojang.serialization.Codec;

public class edk extends eca<eef> {
   public edk(Codec<eef> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eef> $$0) {
      int $$1 = 0;
      ayt $$2 = $$0.d();
      dcv $$3 = $$0.b();
      ir $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dyu.a.d, $$4.u() + $$7, $$4.w() + $$8);
         ir $$10 = new ir($$4.u() + $$7, $$9, $$4.w() + $$8);
         dtc $$11 = dfe.nT.n().a(dmn.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dfe.al) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
