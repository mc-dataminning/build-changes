import com.mojang.serialization.Codec;

public class edn extends eef<egb> {
   public edn(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egb> $$0) {
      jg $$1 = $$0.e();
      dfs $$2 = $$0.b();
      azr $$3 = $$0.d();
      egb $$4 = $$0.f();
      if ($$1.v() < $$2.I_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (jg $$7 : jg.c($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
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

   private boolean a(dew $$0, jg $$1, azr $$2) {
      jg $$3 = $$1.e();
      dvd $$4 = $$0.a_($$3);
      return $$4.a(dia.kE) ? $$2.h() : $$4.c($$0, $$3, jl.b);
   }

   private void a(dew $$0, jg $$1, azr $$2, egb $$3) {
      if ($$0.u($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }
   }
}
