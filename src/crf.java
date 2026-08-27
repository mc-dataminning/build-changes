import javax.annotation.Nullable;

public interface crf {
   bqs k();

   default iv<auy> ap_() {
      return auz.as;
   }

   default bor<csd> a(cry $$0, czu $$1, ckl $$2, bop $$3) {
      csd $$4 = $$2.b($$3);
      bqs $$5 = brg.h($$4);
      if (!$$2.c($$5)) {
         return bor.c($$4);
      } else {
         csd $$6 = $$2.d($$5);
         if ((!cxo.f($$6) || $$2.f()) && !csd.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(avj.c.b($$0));
            }

            csd $$7 = $$6.d() ? $$4 : $$6.e();
            csd $$8 = $$2.f() ? $$4.r() : $$4.e();
            $$2.a($$5, $$8);
            return bor.a($$7, $$1.x_());
         } else {
            return bor.d($$4);
         }
      }
   }

   @Nullable
   static crf c_(csd $$0) {
      cry $$3 = $$0.f();
      if ($$3 instanceof crf) {
         return (crf)$$3;
      } else {
         if ($$0.f() instanceof cqb $$2) {
            dcv var6 = $$2.d();
            if (var6 instanceof crf) {
               return (crf)var6;
            }
         }

         return null;
      }
   }
}
