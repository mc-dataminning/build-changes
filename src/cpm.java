import javax.annotation.Nullable;

public interface cpm {
   bpd i();

   default il<atx> as_() {
      return aty.as;
   }

   default bnd<cqk> a(cqf $$0, cwz $$1, cis $$2, bnb $$3) {
      cqk $$4 = $$2.b($$3);
      bpd $$5 = bpq.h($$4);
      if (!$$2.c($$5)) {
         return bnd.c($$4);
      } else {
         cqk $$6 = $$2.d($$5);
         if ((!cuv.d($$6) || $$2.f()) && !cqk.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(aui.c.b($$0));
            }

            cqk $$7 = $$6.b() ? $$4 : $$6.c();
            cqk $$8 = $$2.f() ? $$4.q() : $$4.c();
            $$2.a($$5, $$8);
            return bnd.a($$7, $$1.x_());
         } else {
            return bnd.d($$4);
         }
      }
   }

   @Nullable
   static cpm c_(cqk $$0) {
      cqf $$3 = $$0.d();
      if ($$3 instanceof cpm) {
         return (cpm)$$3;
      } else {
         if ($$0.d() instanceof cof $$2) {
            daa var6 = $$2.d();
            if (var6 instanceof cpm) {
               return (cpm)var6;
            }
         }

         return null;
      }
   }
}
