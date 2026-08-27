import com.mojang.serialization.Codec;

public class dvn extends duu<dxe> {
   public dvn(Codec<dxe> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxe> $$0) {
      cwz $$1 = $$0.b();
      ib $$2 = $$0.e();
      dme $$3 = $$1.a_($$2.d());
      dxe $$4 = $$0.f();
      awt $$5 = $$0.d();
      if (!$$3.a(aue.aK)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.J_() + 1 && $$6 + 1 < $$1.ak()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               ib $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               dme $$10 = $$4.b.a($$5, $$9);
               if ($$1.u($$9) && $$9.v() > $$1.J_() && $$10.a($$1, $$9)) {
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
