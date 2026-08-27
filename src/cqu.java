import javax.annotation.Nullable;

public interface cqu {
   bqh k();

   default in<aun> ap_() {
      return auo.as;
   }

   default bog<crs> a(crn $$0, czg $$1, cka $$2, boe $$3) {
      crs $$4 = $$2.b($$3);
      bqh $$5 = bqv.h($$4);
      if (!$$2.c($$5)) {
         return bog.c($$4);
      } else {
         crs $$6 = $$2.d($$5);
         if ((!cxa.f($$6) || $$2.f()) && !crs.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(auz.c.b($$0));
            }

            crs $$7 = $$6.d() ? $$4 : $$6.e();
            crs $$8 = $$2.f() ? $$4.r() : $$4.e();
            $$2.a($$5, $$8);
            return bog.a($$7, $$1.x_());
         } else {
            return bog.d($$4);
         }
      }
   }

   @Nullable
   static cqu c_(crs $$0) {
      crn $$3 = $$0.f();
      if ($$3 instanceof cqu) {
         return (cqu)$$3;
      } else {
         if ($$0.f() instanceof cpq $$2) {
            dch var6 = $$2.d();
            if (var6 instanceof cqu) {
               return (cqu)var6;
            }
         }

         return null;
      }
   }
}
