import java.util.List;
import java.util.function.Predicate;

public class cgq extends cir {
   private static final Predicate<big> a = bij.f.and(big::br);
   private final cde.b b;
   private final boolean c;

   public cgq(boolean $$0, cde.b $$1, cir.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      ehd $$4 = a($$0, $$1, cot.b.c);
      if ($$4.c() == ehd.a.a) {
         return bgp.c($$3);
      } else {
         ehf $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<big> $$7 = $$0.a($$1, $$1.cG().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ehf $$8 = $$1.bp();

            for (big $$9 : $$7) {
               eha $$10 = $$9.cG().g((double)$$9.bD());
               if ($$10.d($$8)) {
                  return bgp.c($$3);
               }
            }
         }

         if ($$4.c() == ehd.a.b) {
            cde $$11 = this.a($$0, $$4);
            $$11.a(this.b);
            $$11.r($$1.dA());
            if (!$$0.a($$11, $$11.cG())) {
               return bgp.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dji.t, $$4.e());
                  if (!$$1.fR().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(ape.c.b(this));
               return bgp.a($$3, $$0.r_());
            }
         } else {
            return bgp.c($$3);
         }
      }
   }

   private cde a(cpk $$0, ehd $$1) {
      return (cde)(this.c ? new cdf($$0, $$1.e().c, $$1.e().d, $$1.e().e) : new cde($$0, $$1.e().c, $$1.e().d, $$1.e().e));
   }
}
