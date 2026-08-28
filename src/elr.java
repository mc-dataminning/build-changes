import com.mojang.serialization.Codec;

public class elr extends ekm<eml> {
   public elr(Codec<eml> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<eml> $$0) {
      int $$1 = 0;
      azz $$2 = $$0.d();
      dky $$3 = $$0.b();
      iw $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(ehf.a.d, $$4.u() + $$7, $$4.w() + $$8);
         iw $$10 = new iw($$4.u() + $$7, $$9, $$4.w() + $$8);
         ebg $$11 = dng.nB.m().b(duj.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dng.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
