import com.mojang.serialization.Codec;

public class eez extends edu<eft> {
   public eez(Codec<eft> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<eft> $$0) {
      int $$1 = 0;
      azn $$2 = $$0.d();
      dfg $$3 = $$0.b();
      jf $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(eao.a.d, $$4.u() + $$7, $$4.w() + $$8);
         jf $$10 = new jf($$4.u() + $$7, $$9, $$4.w() + $$8);
         dus $$11 = dho.mV.n().b(dok.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dho.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
