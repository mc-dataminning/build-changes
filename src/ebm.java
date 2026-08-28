import com.mojang.serialization.Codec;

public class ebm extends ecd<edz> {
   public ebm(Codec<edz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecf<edz> $$0) {
      jd $$1 = $$0.e();
      dds $$2 = $$0.b();
      ayw $$3 = $$0.d();
      edz $$4 = $$0.f();
      if ($$1.v() < $$2.I_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (jd $$7 : jd.c($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
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

   private boolean a(dcx $$0, jd $$1, ayw $$2) {
      jd $$3 = $$1.e();
      dtc $$4 = $$0.a_($$3);
      return $$4.a(dga.kE) ? $$2.h() : $$4.d($$0, $$3, ji.b);
   }

   private void a(dcx $$0, jd $$1, ayw $$2, edz $$3) {
      if ($$0.u($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }
   }
}
