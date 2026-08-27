import javax.annotation.Nullable;

public interface cpo {
   bpe i();

   default il<atx> as_() {
      return aty.as;
   }

   default bne<cqm> a(cqh $$0, cxb $$1, ciu $$2, bnc $$3) {
      cqm $$4 = $$2.b($$3);
      bpe $$5 = bpr.h($$4);
      if (!$$2.c($$5)) {
         return bne.c($$4);
      } else {
         cqm $$6 = $$2.d($$5);
         if ((!cux.d($$6) || $$2.f()) && !cqm.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(aui.c.b($$0));
            }

            cqm $$7 = $$6.b() ? $$4 : $$6.c();
            cqm $$8 = $$2.f() ? $$4.q() : $$4.c();
            $$2.a($$5, $$8);
            return bne.a($$7, $$1.x_());
         } else {
            return bne.d($$4);
         }
      }
   }

   @Nullable
   static cpo c_(cqm $$0) {
      cqh $$3 = $$0.d();
      if ($$3 instanceof cpo) {
         return (cpo)$$3;
      } else {
         if ($$0.d() instanceof coh $$2) {
            dac var6 = $$2.d();
            if (var6 instanceof cpo) {
               return (cpo)var6;
            }
         }

         return null;
      }
   }
}
