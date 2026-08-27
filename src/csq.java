import javax.annotation.Nullable;

public interface csq {
   bsb l();

   default ix<avg> ap_() {
      return avh.as;
   }

   default bpv<cto> a(ctj $$0, dax $$1, clw $$2, bpt $$3) {
      cto $$4 = $$2.b($$3);
      bsb $$5 = bsq.h($$4);
      if (!$$2.d($$5)) {
         return bpv.c($$4);
      } else {
         cto $$6 = $$2.a($$5);
         if ((!cza.f($$6) || $$2.f()) && !cto.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(avr.c.b($$0));
            }

            cto $$7 = $$6.e() ? $$4 : $$6.f();
            cto $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bpv.a($$7, $$1.x_());
         } else {
            return bpv.d($$4);
         }
      }
   }

   @Nullable
   static csq c_(cto $$0) {
      ctj $$3 = $$0.g();
      if ($$3 instanceof csq) {
         return (csq)$$3;
      } else {
         if ($$0.g() instanceof crm $$2) {
            ddy var6 = $$2.d();
            if (var6 instanceof csq) {
               return (csq)var6;
            }
         }

         return null;
      }
   }
}
