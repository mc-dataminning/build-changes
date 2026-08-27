import com.mojang.serialization.Codec;

public class dth extends dsc<dub> {
   public dth(Codec<dub> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dse<dub> $$0) {
      int $$1 = 0;
      auw $$2 = $$0.d();
      cus $$3 = $$0.b();
      hx $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(doy.a.d, $$4.u() + $$7, $$4.w() + $$8);
         hx $$10 = new hx($$4.u() + $$7, $$9, $$4.w() + $$8);
         djp $$11 = cxa.mV.o().a(ddu.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(cxa.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
