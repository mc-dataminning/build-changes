import javax.annotation.Nullable;

public interface cql {
   bqc k();

   default il<aul> aq_() {
      return aum.as;
   }

   default bob<crj> a(cre $$0, cyx $$1, cjt $$2, bnz $$3) {
      crj $$4 = $$2.b($$3);
      bqc $$5 = bqq.h($$4);
      if (!$$2.c($$5)) {
         return bob.c($$4);
      } else {
         crj $$6 = $$2.d($$5);
         if ((!cwr.e($$6) || $$2.f()) && !crj.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(auw.c.b($$0));
            }

            crj $$7 = $$6.d() ? $$4 : $$6.e();
            crj $$8 = $$2.f() ? $$4.r() : $$4.e();
            $$2.a($$5, $$8);
            return bob.a($$7, $$1.x_());
         } else {
            return bob.d($$4);
         }
      }
   }

   @Nullable
   static cql c_(crj $$0) {
      cre $$3 = $$0.f();
      if ($$3 instanceof cql) {
         return (cql)$$3;
      } else {
         if ($$0.f() instanceof cph $$2) {
            dby var6 = $$2.d();
            if (var6 instanceof cql) {
               return (cql)var6;
            }
         }

         return null;
      }
   }
}
