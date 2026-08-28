import com.mojang.serialization.Codec;

public class eey extends eef<egp> {
   public eey(Codec<egp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egp> $$0) {
      dfs $$1 = $$0.b();
      jg $$2 = $$0.e();
      dvd $$3 = $$1.a_($$2.e());
      egp $$4 = $$0.f();
      azr $$5 = $$0.d();
      if (!$$3.a(awz.aM)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.I_() + 1 && $$6 + 1 <= $$1.an()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               jg $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dvd $$10 = $$4.b.a($$5, $$9);
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
