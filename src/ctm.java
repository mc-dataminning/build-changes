import javax.annotation.Nullable;

public interface ctm {
   bsw m();

   default ji<avv> aq_() {
      return avw.as;
   }

   default bqq<cuk> a(cuf $$0, dbt $$1, cms $$2, bqo $$3) {
      cuk $$4 = $$2.b($$3);
      bsw $$5 = btm.h($$4);
      if (!$$2.d($$5)) {
         return bqq.c($$4);
      } else {
         cuk $$6 = $$2.a($$5);
         if ((!czw.f($$6) || $$2.f()) && !cuk.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(awg.c.b($$0));
            }

            cuk $$7 = $$6.e() ? $$4 : $$6.f();
            cuk $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bqq.a($$7, $$1.x_());
         } else {
            return bqq.d($$4);
         }
      }
   }

   @Nullable
   static ctm c_(cuk $$0) {
      cuf $$3 = $$0.g();
      if ($$3 instanceof ctm) {
         return (ctm)$$3;
      } else {
         if ($$0.g() instanceof csi $$2) {
            deu var6 = $$2.d();
            if (var6 instanceof ctm) {
               return (ctm)var6;
            }
         }

         return null;
      }
   }
}
