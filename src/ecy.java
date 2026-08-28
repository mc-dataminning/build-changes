import com.mojang.serialization.Codec;

public class ecy extends edq<efm> {
   public ecy(Codec<efm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<efm> $$0) {
      je $$1 = $$0.e();
      dfd $$2 = $$0.b();
      azl $$3 = $$0.d();
      efm $$4 = $$0.f();
      if ($$1.v() < $$2.G_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (je $$7 : je.c($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
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

   private boolean a(deh $$0, je $$1, azl $$2) {
      je $$3 = $$1.e();
      duo $$4 = $$0.a_($$3);
      return $$4.a(dhl.kE) ? $$2.h() : $$4.c($$0, $$3, jj.b);
   }

   private void a(deh $$0, je $$1, azl $$2, efm $$3) {
      if ($$0.u($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }
   }
}
