import com.mojang.serialization.Codec;

public class dqu extends drn<dtk> {
   public dqu(Codec<dtk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dtk> $$0) {
      hx $$1 = $$0.e();
      cud $$2 = $$0.b();
      aup $$3 = $$0.d();

      dtk $$4;
      for ($$4 = $$0.f(); $$1.v() > $$2.J_() + 3; $$1 = $$1.d()) {
         if (!$$2.u($$1.d())) {
            dja $$5 = $$2.a_($$1.d());
            if (b($$5) || a($$5)) {
               break;
            }
         }
      }

      if ($$1.v() <= $$2.J_() + 3) {
         return false;
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            int $$7 = $$3.a(2);
            int $$8 = $$3.a(2);
            int $$9 = $$3.a(2);
            float $$10 = (float)($$7 + $$8 + $$9) * 0.333F + 0.5F;

            for (hx $$11 : hx.a($$1.b(-$$7, -$$8, -$$9), $$1.b($$7, $$8, $$9))) {
               if ($$11.j($$1) <= (double)($$10 * $$10)) {
                  $$2.a($$11, $$4.b, 3);
               }
            }

            $$1 = $$1.b(-1 + $$3.a(2), -$$3.a(2), -1 + $$3.a(2));
         }

         return true;
      }
   }
}
