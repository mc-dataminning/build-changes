import com.mojang.serialization.Codec;

public class emb extends ekw<emv> {
   public emb(Codec<emv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<emv> $$0) {
      int $$1 = 0;
      bai $$2 = $$0.d();
      dli $$3 = $$0.b();
      iw $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(ehp.a.d, $$4.u() + $$7, $$4.w() + $$8);
         iw $$10 = new iw($$4.u() + $$7, $$9, $$4.w() + $$8);
         ebq $$11 = dnq.nB.m().b(dut.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dnq.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
