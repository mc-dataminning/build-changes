import com.mojang.serialization.Codec;

public class dos extends dnn<dpm> {
   public dos(Codec<dpm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dpm> $$0) {
      int $$1 = 0;
      aru $$2 = $$0.d();
      cqg $$3 = $$0.b();
      gu $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dkj.a.d, $$4.u() + $$7, $$4.w() + $$8);
         gu $$10 = new gu($$4.u() + $$7, $$9, $$4.w() + $$8);
         dfa $$11 = csn.mV.n().a(czj.b, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(csn.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
