import com.mojang.serialization.Codec;

public class eff extends efx<eht> {
   public eff(Codec<eht> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eht> $$0) {
      ji $$1 = $$0.e();
      dhf $$2 = $$0.b();
      azh $$3 = $$0.d();
      eht $$4 = $$0.f();
      if ($$1.v() < $$2.L_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (ji $$7 : ji.c($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
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

   private boolean a(dgi $$0, ji $$1, azh $$2) {
      ji $$3 = $$1.e();
      dww $$4 = $$0.a_($$3);
      return $$4.a(djn.lg) ? $$2.h() : $$4.c($$0, $$3, jn.b);
   }

   private void a(dgi $$0, ji $$1, azh $$2, eht $$3) {
      if ($$0.u($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }
   }
}
