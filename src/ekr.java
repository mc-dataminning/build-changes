import com.mojang.serialization.Codec;

public class ekr extends ejm<ell> {
   public ekr(Codec<ell> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<ell> $$0) {
      int $$1 = 0;
      azv $$2 = $$0.d();
      djz $$3 = $$0.b();
      iu $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(egg.a.d, $$4.u() + $$7, $$4.w() + $$8);
         iu $$10 = new iu($$4.u() + $$7, $$9, $$4.w() + $$8);
         eah $$11 = dmh.nB.m().b(dtk.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dmh.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
