import com.mojang.serialization.Codec;

public class egp extends efw<eig> {
   public egp(Codec<eig> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eig> $$0) {
      dhe $$1 = $$0.b();
      ji $$2 = $$0.e();
      dwv $$3 = $$1.a_($$2.e());
      eig $$4 = $$0.f();
      azg $$5 = $$0.d();
      if (!$$3.a(awo.aO)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.L_() + 1 && $$6 + 1 <= $$1.an()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               ji $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dwv $$10 = $$4.b.a($$5, $$9);
               if ($$1.u($$9) && $$9.v() > $$1.L_() && $$10.a($$1, $$9)) {
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
