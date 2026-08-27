import javax.annotation.Nullable;

public interface coe {
   bnx g();

   default atk au_() {
      return atl.aq;
   }

   default blx<cpd> a(coy $$0, cvr $$1, chl $$2, blv $$3) {
      cpd $$4 = $$2.b($$3);
      bnx $$5 = bok.h($$4);
      cpd $$6 = $$2.c($$5);
      if ((!ctn.d($$6) || $$2.f()) && !cpd.a($$4, $$6)) {
         if (!$$1.y_()) {
            $$2.b(atv.c.b($$0));
         }

         cpd $$7 = $$6.b() ? $$4 : $$6.c();
         cpd $$8 = $$2.f() ? $$4.q() : $$4.c();
         $$2.a($$5, $$8);
         return blx.a($$7, $$1.y_());
      } else {
         return blx.d($$4);
      }
   }

   @Nullable
   static coe c_(cpd $$0) {
      coy $$3 = $$0.d();
      if ($$3 instanceof coe) {
         return (coe)$$3;
      } else {
         if ($$0.d() instanceof cmw $$2) {
            cys var6 = $$2.e();
            if (var6 instanceof coe) {
               return (coe)var6;
            }
         }

         return null;
      }
   }
}
