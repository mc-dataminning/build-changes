import com.mojang.serialization.Codec;

public class eew extends edq<ege> {
   public eew(Codec<ege> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<ege> $$0) {
      boolean $$1 = false;
      azl $$2 = $$0.d();
      dfd $$3 = $$0.b();
      je $$4 = $$0.e();
      ege $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(eak.a.d, $$4.u() + $$6, $$4.w() + $$7);
      je $$9 = new je($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dhl.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         duo $$11 = $$10 ? dhl.bx.o() : dhl.bw.o();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               duo $$12 = $$11.b(dpq.d, dvk.a);
               je $$13 = $$9.d();
               if ($$3.a_($$13).a(dhl.G)) {
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
