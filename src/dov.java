import com.mojang.serialization.Codec;

public class dov extends dnq<dpp> {
   public dov(Codec<dpp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dpp> $$0) {
      int $$1 = 0;
      ash $$2 = $$0.d();
      cqv $$3 = $$0.b();
      gw $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dkm.a.d, $$4.u() + $$7, $$4.w() + $$8);
         gw $$10 = new gw($$4.u() + $$7, $$9, $$4.w() + $$8);
         dfd $$11 = cte.mV.o().a(czx.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(cte.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
