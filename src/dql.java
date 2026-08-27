import com.mojang.serialization.Codec;

public class dql extends drc<dsy> {
   public dql(Codec<dsy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dsy> $$0) {
      hv $$1 = $$0.e();
      ctt $$2 = $$0.b();
      auf $$3 = $$0.d();
      dsy $$4 = $$0.f();
      if ($$1.v() < $$2.J_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (hv $$7 : hv.a($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
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

   private boolean a(csz $$0, hv $$1, auf $$2) {
      hv $$3 = $$1.d();
      dip $$4 = $$0.a_($$3);
      return $$4.a(cwb.kE) ? $$2.h() : $$4.d($$0, $$3, ia.b);
   }

   private void a(csz $$0, hv $$1, auf $$2, dsy $$3) {
      if ($$0.t($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }
   }
}
