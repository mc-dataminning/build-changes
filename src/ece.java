import com.mojang.serialization.Codec;

public class ece extends eaz<ecy> {
   public ece(Codec<ecy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebb<ecy> $$0) {
      int $$1 = 0;
      azh $$2 = $$0.d();
      dcu $$3 = $$0.b();
      iz $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dxv.a.d, $$4.u() + $$7, $$4.w() + $$8);
         iz $$10 = new iz($$4.u() + $$7, $$9, $$4.w() + $$8);
         dsd $$11 = dfc.mV.o().a(dlx.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dfc.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
