import com.mojang.serialization.Codec;

public class dzj extends dye<ead> {
   public dzj(Codec<ead> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<ead> $$0) {
      int $$1 = 0;
      axt $$2 = $$0.d();
      dab $$3 = $$0.b();
      id $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(dva.a.d, $$4.u() + $$7, $$4.w() + $$8);
         id $$10 = new id($$4.u() + $$7, $$9, $$4.w() + $$8);
         dpi $$11 = dcj.mV.n().a(djd.c, Integer.valueOf($$2.a(4) + 1));
         if ($$3.a_($$10).a(dcj.G) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
