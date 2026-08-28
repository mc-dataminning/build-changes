import com.mojang.serialization.Codec;

public class ecw extends ecd<een> {
   public ecw(Codec<een> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<een> $$0) {
      dds $$1 = $$0.b();
      jd $$2 = $$0.e();
      dtc $$3 = $$1.a_($$2.e());
      een $$4 = $$0.f();
      ayw $$5 = $$0.d();
      if (!$$3.a(awe.aL)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.I_() + 1 && $$6 + 1 < $$1.am()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               jd $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dtc $$10 = $$4.b.a($$5, $$9);
               if ($$1.u($$9) && $$9.v() > $$1.I_() && $$10.a($$1, $$9)) {
                  $$1.a($$9, $$10, 2);
                  $$7++;
               }
            }

            return $$7 > 0;
         } else {
            return false;
         }
      }
   }
}
