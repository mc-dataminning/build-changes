import com.mojang.serialization.Codec;

public class dve extends dtz<dvy> {
   public dve(Codec<dvy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<dvy> $$0) {
      int $$1 = 0;
      awp $$2 = $$0.d();
      cwm $$3 = $$0.b();
      hz $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dqv.a.d, $$4.u() + $$7, $$4.w() + $$8);
         hz $$10 = new hz($$4.u() + $$7, $$9, $$4.w() + $$8);
         dlj $$11 = cyu.mV.o().a(dfo.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(cyu.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
