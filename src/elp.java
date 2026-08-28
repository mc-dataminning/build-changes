import com.mojang.serialization.Codec;

public class elp extends ekw<enh> {
   public elp(Codec<enh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<enh> $$0) {
      dli $$1 = $$0.b();
      iw $$2 = $$0.e();
      ebq $$3 = $$1.a_($$2.e());
      enh $$4 = $$0.f();
      bai $$5 = $$0.d();
      if (!$$3.a(axn.aO)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.K_() + 1 && $$6 + 1 <= $$1.ao()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               iw $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               ebq $$10 = $$4.b.a($$5, $$9);
               if ($$1.v($$9) && $$9.v() > $$1.K_() && $$10.a($$1, $$9)) {
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
