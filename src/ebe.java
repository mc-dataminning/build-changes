import com.mojang.serialization.Codec;

public class ebe extends dzz<eby> {
   public ebe(Codec<eby> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<eby> $$0) {
      int $$1 = 0;
      aym $$2 = $$0.d();
      dbu $$3 = $$0.b();
      io $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dwv.a.d, $$4.u() + $$7, $$4.w() + $$8);
         io $$10 = new io($$4.u() + $$7, $$9, $$4.w() + $$8);
         drd $$11 = dec.mV.n().a(dkx.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dec.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
