import com.mojang.serialization.Codec;

public class dsz extends dru<dtt> {
   public dsz(Codec<dtt> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<dtt> $$0) {
      int $$1 = 0;
      auv $$2 = $$0.d();
      cuk $$3 = $$0.b();
      hx $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(doq.a.d, $$4.u() + $$7, $$4.w() + $$8);
         hx $$10 = new hx($$4.u() + $$7, $$9, $$4.w() + $$8);
         djh $$11 = cws.mV.o().a(ddm.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(cws.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
