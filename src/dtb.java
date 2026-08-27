import com.mojang.serialization.Codec;

public class dtb extends dts<dvo> {
   public dtb(Codec<dvo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dvo> $$0) {
      hz $$1 = $$0.e();
      cwi $$2 = $$0.b();
      awo $$3 = $$0.d();
      dvo $$4 = $$0.f();
      if ($$1.v() < $$2.J_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (hz $$7 : hz.a($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
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

   private boolean a(cvo $$0, hz $$1, awo $$2) {
      hz $$3 = $$1.d();
      dlf $$4 = $$0.a_($$3);
      return $$4.a(cyq.kE) ? $$2.h() : $$4.d($$0, $$3, ie.b);
   }

   private void a(cvo $$0, hz $$1, awo $$2, dvo $$3) {
      if ($$0.u($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }
   }
}
