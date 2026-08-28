import javax.annotation.Nullable;

public interface ctp {
   bsz m();

   default ji<avy> n() {
      return avz.as;
   }

   default bqt<cun> a(cui $$0, dbw $$1, cmv $$2, bqr $$3) {
      cun $$4 = $$2.b($$3);
      bsz $$5 = btp.h($$4);
      if (!$$2.d($$5)) {
         return bqt.c($$4);
      } else {
         cun $$6 = $$2.a($$5);
         if ((!czz.f($$6) || $$2.f()) && !cun.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(awj.c.b($$0));
            }

            cun $$7 = $$6.e() ? $$4 : $$6.f();
            cun $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bqt.a($$7, $$1.x_());
         } else {
            return bqt.d($$4);
         }
      }
   }

   @Nullable
   static ctp c_(cun $$0) {
      cui $$3 = $$0.g();
      if ($$3 instanceof ctp) {
         return (ctp)$$3;
      } else {
         if ($$0.g() instanceof csl $$2) {
            dex var6 = $$2.d();
            if (var6 instanceof ctp) {
               return (ctp)var6;
            }
         }

         return null;
      }
   }
}
