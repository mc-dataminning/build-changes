import com.mojang.serialization.Codec;

public class ebc extends dzx<ebw> {
   public ebc(Codec<ebw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ebw> $$0) {
      int $$1 = 0;
      ayk $$2 = $$0.d();
      dbs $$3 = $$0.b();
      io $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dwt.a.d, $$4.u() + $$7, $$4.w() + $$8);
         io $$10 = new io($$4.u() + $$7, $$9, $$4.w() + $$8);
         drb $$11 = dea.mV.n().a(dkv.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dea.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
