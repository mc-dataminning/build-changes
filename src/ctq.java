import javax.annotation.Nullable;

public interface ctq {
   bsx m();

   default jm<avn> n() {
      return avo.as;
   }

   default bqr<cuo> a(cuj $$0, dcu $$1, cmv $$2, bqp $$3) {
      cuo $$4 = $$2.b($$3);
      bsx $$5 = $$2.h($$4);
      if (!$$2.d($$5)) {
         return bqr.c($$4);
      } else {
         cuo $$6 = $$2.a($$5);
         if ((!dac.a($$6, dab.E) || $$2.f()) && !cuo.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(avy.c.b($$0));
            }

            cuo $$7 = $$6.e() ? $$4 : $$6.f();
            cuo $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bqr.a($$7, $$1.x_());
         } else {
            return bqr.d($$4);
         }
      }
   }

   @Nullable
   static ctq c_(cuo $$0) {
      cuj $$3 = $$0.g();
      if ($$3 instanceof ctq) {
         return (ctq)$$3;
      } else {
         if ($$0.g() instanceof csm $$2) {
            dfw var6 = $$2.d();
            if (var6 instanceof ctq) {
               return (ctq)var6;
            }
         }

         return null;
      }
   }
}
