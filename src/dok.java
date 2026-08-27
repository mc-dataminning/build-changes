import com.mojang.serialization.Codec;

public class dok extends dnr<dqb> {
   public dok(Codec<dqb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqb> $$0) {
      cqk $$1 = $$0.b();
      gw $$2 = $$0.e();
      dfe $$3 = $$1.a_($$2.d());
      dqb $$4 = $$0.f();
      arx $$5 = $$0.d();
      if (!$$3.a(apo.aK)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.C_() + 1 && $$6 + 1 < $$1.aj()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               gw $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dfe $$10 = $$4.b.a($$5, $$9);
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
