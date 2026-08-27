import com.mojang.serialization.Codec;

public class dsy extends drt<dts> {
   public dsy(Codec<dts> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<dts> $$0) {
      int $$1 = 0;
      auu $$2 = $$0.d();
      cuj $$3 = $$0.b();
      hx $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dop.a.d, $$4.u() + $$7, $$4.w() + $$8);
         hx $$10 = new hx($$4.u() + $$7, $$9, $$4.w() + $$8);
         djg $$11 = cwr.mV.o().a(ddl.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(cwr.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
