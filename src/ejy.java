import com.mojang.serialization.Codec;

public class ejy extends eit<eks> {
   public ejy(Codec<eks> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<eks> $$0) {
      int $$1 = 0;
      azt $$2 = $$0.d();
      djo $$3 = $$0.b();
      iu $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(efn.a.d, $$4.u() + $$7, $$4.w() + $$8);
         iu $$10 = new iu($$4.u() + $$7, $$9, $$4.w() + $$8);
         dzo $$11 = dlw.nx.m().b(dsw.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dlw.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
