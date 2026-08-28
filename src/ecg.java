import com.mojang.serialization.Codec;

public class ecg extends eba<edo> {
   public ecg(Codec<edo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebc<edo> $$0) {
      boolean $$1 = false;
      azh $$2 = $$0.d();
      dcv $$3 = $$0.b();
      iz $$4 = $$0.e();
      edo $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(dxw.a.d, $$4.u() + $$6, $$4.w() + $$7);
      iz $$9 = new iz($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dfd.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dse $$11 = $$10 ? dfd.bx.o() : dfd.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dse $$12 = $$11.a(dnh.d, dta.a);
               iz $$13 = $$9.c();
               if ($$3.a_($$13).a(dfd.G)) {
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
