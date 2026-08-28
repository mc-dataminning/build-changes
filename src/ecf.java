import com.mojang.serialization.Codec;

public class ecf extends eaz<edn> {
   public ecf(Codec<edn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebb<edn> $$0) {
      boolean $$1 = false;
      azh $$2 = $$0.d();
      dcu $$3 = $$0.b();
      iz $$4 = $$0.e();
      edn $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dxv.a.d, $$4.u() + $$6, $$4.w() + $$7);
      iz $$9 = new iz($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dfc.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dsd $$11 = $$10 ? dfc.bx.o() : dfc.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dsd $$12 = $$11.a(dng.d, dsz.a);
               iz $$13 = $$9.c();
               if ($$3.a_($$13).a(dfc.G)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
