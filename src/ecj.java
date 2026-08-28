import com.mojang.serialization.Codec;

public class ecj extends ebe<edd> {
   public ecj(Codec<edd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edd> $$0) {
      int $$1 = 0;
      aym $$2 = $$0.d();
      dcz $$3 = $$0.b();
      ja $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dxz.a.d, $$4.u() + $$7, $$4.w() + $$8);
         ja $$10 = new ja($$4.u() + $$7, $$9, $$4.w() + $$8);
         dsh $$11 = dfh.mV.o().a(dmc.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dfh.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
