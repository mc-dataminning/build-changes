import com.mojang.serialization.Codec;

public class ekr extends ejy<emi> {
   public ekr(Codec<emi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<emi> $$0) {
      dkl $$1 = $$0.b();
      iv $$2 = $$0.e();
      eat $$3 = $$1.a_($$2.e());
      emi $$4 = $$0.f();
      azv $$5 = $$0.d();
      if (!$$3.a(axc.aO)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.G_() + 1 && $$6 + 1 <= $$1.ao()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               iv $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               eat $$10 = $$4.b.a($$5, $$9);
               if ($$1.v($$9) && $$9.v() > $$1.G_() && $$10.a($$1, $$9)) {
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
