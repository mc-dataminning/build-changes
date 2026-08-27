import com.mojang.serialization.Codec;

public class dmu extends dnl<dph> {
   public dmu(Codec<dph> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dph> $$0) {
      gv $$1 = $$0.e();
      cqe $$2 = $$0.b();
      art $$3 = $$0.d();
      dph $$4 = $$0.f();
      if ($$1.v() < $$2.C_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (gv $$7 : gv.a($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
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

   private boolean a(cpl $$0, gv $$1, art $$2) {
      gv $$3 = $$1.d();
      dey $$4 = $$0.a_($$3);
      return $$4.a(csl.kE) ? $$2.h() : $$4.d($$0, $$3, hb.b);
   }

   private void a(cpl $$0, gv $$1, art $$2, dph $$3) {
      if ($$0.t($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }
   }
}
