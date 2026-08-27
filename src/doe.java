import com.mojang.serialization.Codec;

public class doe extends dnl<dpv> {
   public doe(Codec<dpv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpv> $$0) {
      cqe $$1 = $$0.b();
      gv $$2 = $$0.e();
      dey $$3 = $$1.a_($$2.d());
      dpv $$4 = $$0.f();
      art $$5 = $$0.d();
      if (!$$3.a(apj.aK)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.C_() + 1 && $$6 + 1 < $$1.aj()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               gv $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dey $$10 = $$4.b.a($$5, $$9);
               if ($$1.t($$9) && $$9.v() > $$1.C_() && $$10.a($$1, $$9)) {
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
