import com.mojang.serialization.Codec;

public class efk extends eef<ege> {
   public efk(Codec<ege> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<ege> $$0) {
      int $$1 = 0;
      azr $$2 = $$0.d();
      dfs $$3 = $$0.b();
      jg $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(eaz.a.d, $$4.u() + $$7, $$4.w() + $$8);
         jg $$10 = new jg($$4.u() + $$7, $$9, $$4.w() + $$8);
         dvd $$11 = dia.mV.m().b(dov.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dia.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
