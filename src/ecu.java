import com.mojang.serialization.Codec;

public class ecu extends eca<eeq> {
   public ecu(Codec<eeq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eeq> $$0) {
      dcv $$1 = $$0.b();
      ir $$2 = $$0.e();
      dtc $$3 = $$1.a_($$2.d());
      eeq $$4 = $$0.f();
      ayt $$5 = $$0.d();
      if (!$$3.a(awe.aN)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.J_() + 1 && $$6 + 1 < $$1.am()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               ir $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dtc $$10 = $$4.b.a($$5, $$9);
               if ($$1.u($$9) && $$9.v() > $$1.J_() && $$10.a($$1, $$9)) {
                  edm.a($$10, $$1, $$9);
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
