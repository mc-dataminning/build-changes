import com.mojang.serialization.Codec;

public class edv extends edc<efm> {
   public edv(Codec<efm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ede<efm> $$0) {
      dep $$1 = $$0.b();
      je $$2 = $$0.e();
      dua $$3 = $$1.a_($$2.e());
      efm $$4 = $$0.f();
      azk $$5 = $$0.d();
      if (!$$3.a(aws.aM)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.G_() + 1 && $$6 + 1 < $$1.an()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               je $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dua $$10 = $$4.b.a($$5, $$9);
               if ($$1.u($$9) && $$9.v() > $$1.G_() && $$10.a($$1, $$9)) {
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
