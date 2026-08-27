import com.mojang.serialization.Codec;

public class dsh extends drc<dtb> {
   public dsh(Codec<dtb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtb> $$0) {
      int $$1 = 0;
      auf $$2 = $$0.d();
      ctt $$3 = $$0.b();
      hv $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dny.a.d, $$4.u() + $$7, $$4.w() + $$8);
         hv $$10 = new hv($$4.u() + $$7, $$9, $$4.w() + $$8);
         dip $$11 = cwb.mV.o().a(dcv.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(cwb.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
