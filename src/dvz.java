import com.mojang.serialization.Codec;

public class dvz extends duu<dwt> {
   public dvz(Codec<dwt> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dwt> $$0) {
      int $$1 = 0;
      awt $$2 = $$0.d();
      cwz $$3 = $$0.b();
      ib $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(drq.a.d, $$4.u() + $$7, $$4.w() + $$8);
         ib $$10 = new ib($$4.u() + $$7, $$9, $$4.w() + $$8);
         dme $$11 = czh.mV.o().a(dgb.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(czh.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
