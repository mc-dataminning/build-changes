import com.mojang.serialization.Codec;

public class drv extends drc<dtm> {
   public drv(Codec<dtm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtm> $$0) {
      ctt $$1 = $$0.b();
      hv $$2 = $$0.e();
      dip $$3 = $$1.a_($$2.d());
      dtm $$4 = $$0.f();
      auf $$5 = $$0.d();
      if (!$$3.a(arr.aK)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.J_() + 1 && $$6 + 1 < $$1.ak()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               hv $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dip $$10 = $$4.b.a($$5, $$9);
               if ($$1.t($$9) && $$9.v() > $$1.J_() && $$10.a($$1, $$9)) {
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
