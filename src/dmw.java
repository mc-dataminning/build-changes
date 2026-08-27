import com.mojang.serialization.Codec;

public class dmw extends dnn<dpj> {
   public dmw(Codec<dpj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dpj> $$0) {
      gu $$1 = $$0.e();
      cqg $$2 = $$0.b();
      aru $$3 = $$0.d();
      dpj $$4 = $$0.f();
      if ($$1.v() < $$2.C_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (gu $$7 : gu.a($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
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

   private boolean a(cpn $$0, gu $$1, aru $$2) {
      gu $$3 = $$1.d();
      dfa $$4 = $$0.a_($$3);
      return $$4.a(csn.kE) ? $$2.h() : $$4.d($$0, $$3, ha.b);
   }

   private void a(cpn $$0, gu $$1, aru $$2, dpj $$3) {
      if ($$0.t($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }
   }
}
