import com.mojang.serialization.Codec;

public class elp extends ekk<emj> {
   public elp(Codec<emj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emj> $$0) {
      int $$1 = 0;
      azx $$2 = $$0.d();
      dkw $$3 = $$0.b();
      iv $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(ehd.a.d, $$4.u() + $$7, $$4.w() + $$8);
         iv $$10 = new iv($$4.u() + $$7, $$9, $$4.w() + $$8);
         ebe $$11 = dne.nB.m().b(duh.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dne.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
