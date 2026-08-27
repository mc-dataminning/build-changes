import com.mojang.serialization.Codec;

public class dss extends drn<dtm> {
   public dss(Codec<dtm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dtm> $$0) {
      int $$1 = 0;
      aup $$2 = $$0.d();
      cud $$3 = $$0.b();
      hx $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(doj.a.d, $$4.u() + $$7, $$4.w() + $$8);
         hx $$10 = new hx($$4.u() + $$7, $$9, $$4.w() + $$8);
         dja $$11 = cwl.mV.o().a(ddf.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(cwl.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
