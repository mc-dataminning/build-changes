import javax.annotation.Nullable;

public interface chx extends ckq {
   bil g();

   default aot ak_() {
      return aou.af;
   }

   default bgp<ciw> a(cir $$0, cpk $$1, cbl $$2, bgn $$3) {
      ciw $$4 = $$2.b($$3);
      bil $$5 = biy.h($$4);
      ciw $$6 = $$2.c($$5);
      if ((!cnf.d($$6) || $$2.f()) && !ciw.a($$4, $$6)) {
         if (!$$1.r_()) {
            $$2.b(ape.c.b($$0));
         }

         ciw $$7 = $$6.b() ? $$4 : $$6.c();
         ciw $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bgp.a($$7, $$1.r_());
      } else {
         return bgp.d($$4);
      }
   }

   @Nullable
   static chx c_(ciw $$0) {
      cir $$3 = $$0.d();
      if ($$3 instanceof chx) {
         return (chx)$$3;
      } else {
         if ($$0.d() instanceof cgp $$2) {
            csk var6 = $$2.e();
            if (var6 instanceof chx) {
               return (chx)var6;
            }
         }

         return null;
      }
   }
}
