import javax.annotation.Nullable;

public interface clz extends cot {
   bma g();

   default arr as_() {
      return ars.af;
   }

   default bkc<cmy> a(cmt $$0, ctp $$1, cfi $$2, bka $$3) {
      cmy $$4 = $$2.b($$3);
      bma $$5 = bmn.h($$4);
      cmy $$6 = $$2.c($$5);
      if ((!crl.d($$6) || $$2.f()) && !cmy.a($$4, $$6)) {
         if (!$$1.y_()) {
            $$2.b(asc.c.b($$0));
         }

         cmy $$7 = $$6.b() ? $$4 : $$6.c();
         cmy $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bkc.a($$7, $$1.y_());
      } else {
         return bkc.d($$4);
      }
   }

   @Nullable
   static clz c_(cmy $$0) {
      cmt $$3 = $$0.d();
      if ($$3 instanceof clz) {
         return (clz)$$3;
      } else {
         if ($$0.d() instanceof ckr $$2) {
            cwq var6 = $$2.e();
            if (var6 instanceof clz) {
               return (clz)var6;
            }
         }

         return null;
      }
   }
}
