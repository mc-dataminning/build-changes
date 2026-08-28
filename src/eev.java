import com.mojang.serialization.Codec;

public class eev extends edq<efp> {
   public eev(Codec<efp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<efp> $$0) {
      int $$1 = 0;
      azl $$2 = $$0.d();
      dfd $$3 = $$0.b();
      je $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(eak.a.d, $$4.u() + $$7, $$4.w() + $$8);
         je $$10 = new je($$4.u() + $$7, $$9, $$4.w() + $$8);
         duo $$11 = dhl.mV.o().b(doh.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dhl.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
