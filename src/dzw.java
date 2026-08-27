import com.mojang.serialization.Codec;

public class dzw extends dzd<ebn> {
   public dzw(Codec<ebn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebn> $$0) {
      day $$1 = $$0.b();
      in $$2 = $$0.e();
      dqh $$3 = $$1.a_($$2.d());
      ebn $$4 = $$0.f();
      ayg $$5 = $$0.d();
      if (!$$3.a(avr.aL)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.I_() + 1 && $$6 + 1 < $$1.al()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               in $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dqh $$10 = $$4.b.a($$5, $$9);
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
