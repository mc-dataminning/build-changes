import com.mojang.serialization.Codec;

public class ebr extends eay<edi> {
   public ebr(Codec<edi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<edi> $$0) {
      dct $$1 = $$0.b();
      iz $$2 = $$0.e();
      dsc $$3 = $$1.a_($$2.d());
      edi $$4 = $$0.f();
      azh $$5 = $$0.d();
      if (!$$3.a(awp.aL)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.I_() + 1 && $$6 + 1 < $$1.am()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               iz $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dsc $$10 = $$4.b.a($$5, $$9);
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
