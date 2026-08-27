import com.mojang.serialization.Codec;

public class dpj extends dqa<drw> {
   public dpj(Codec<drw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<drw> $$0) {
      hx $$1 = $$0.e();
      csz $$2 = $$0.b();
      atw $$3 = $$0.d();
      drw $$4 = $$0.f();
      if ($$1.v() < $$2.J_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (hx $$7 : hx.a($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
            int $$8 = $$1.u() - $$7.u();
            int $$9 = $$1.w() - $$7.w();
            if ((float)($$8 * $$8 + $$9 * $$9) <= $$3.i() * 10.0F - $$3.i() * 6.0F) {
               this.a($$2, $$7, $$3, $$4);
            } else if ((double)$$3.i() < 0.031) {
               this.a($$2, $$7, $$3, $$4);
            }
         }

         return true;
      }
   }

   private boolean a(csg $$0, hx $$1, atw $$2) {
      hx $$3 = $$1.d();
      dhn $$4 = $$0.a_($$3);
      return $$4.a(cvh.kE) ? $$2.h() : $$4.d($$0, $$3, ib.b);
   }

   private void a(csg $$0, hx $$1, atw $$2, drw $$3) {
      if ($$0.t($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }
   }
}
