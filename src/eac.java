import com.mojang.serialization.Codec;

public class eac extends eat<ecp> {
   public eac(Codec<ecp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<ecp> $$0) {
      iz $$1 = $$0.e();
      dco $$2 = $$0.b();
      azc $$3 = $$0.d();
      ecp $$4 = $$0.f();
      if ($$1.v() < $$2.I_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (iz $$7 : iz.c($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
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

   private boolean a(dbu $$0, iz $$1, azc $$2) {
      iz $$3 = $$1.d();
      drx $$4 = $$0.a_($$3);
      return $$4.a(dew.kE) ? $$2.h() : $$4.d($$0, $$3, je.b);
   }

   private void a(dbu $$0, iz $$1, azc $$2, ecp $$3) {
      if ($$0.u($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }
   }
}
