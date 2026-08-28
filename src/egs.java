import com.mojang.serialization.Codec;

public class egs extends efz<eij> {
   public egs(Codec<eij> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<eij> $$0) {
      dhh $$1 = $$0.b();
      ji $$2 = $$0.e();
      dwy $$3 = $$1.a_($$2.e());
      eij $$4 = $$0.f();
      azh $$5 = $$0.d();
      if (!$$3.a(awp.aO)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.L_() + 1 && $$6 + 1 <= $$1.an()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               ji $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dwy $$10 = $$4.b.a($$5, $$9);
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
