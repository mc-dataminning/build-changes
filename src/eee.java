import com.mojang.serialization.Codec;

public class eee extends eew<egs> {
   public eee(Codec<egs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<egs> $$0) {
      jh $$1 = $$0.e();
      dgk $$2 = $$0.b();
      azu $$3 = $$0.d();
      egs $$4 = $$0.f();
      if ($$1.v() < $$2.K_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (jh $$7 : jh.c($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
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

   private boolean a(dfn $$0, jh $$1, azu $$2) {
      jh $$3 = $$1.e();
      dvv $$4 = $$0.a_($$3);
      return $$4.a(dis.kE) ? $$2.h() : $$4.c($$0, $$3, jm.b);
   }

   private void a(dfn $$0, jh $$1, azu $$2, egs $$3) {
      if ($$0.u($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 4);
      }
   }
}
