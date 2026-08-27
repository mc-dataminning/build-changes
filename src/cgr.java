import java.util.List;
import java.util.function.Predicate;

public class cgr extends cis {
   private static final Predicate<bii> a = bil.f.and(bii::br);
   private final cdf.b b;
   private final boolean c;

   public cgr(boolean $$0, cdf.b $$1, cis.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      cix $$3 = $$1.b($$2);
      ehb $$4 = a($$0, $$1, cou.b.c);
      if ($$4.c() == ehb.a.a) {
         return bgr.c($$3);
      } else {
         ehd $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bii> $$7 = $$0.a($$1, $$1.cG().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ehd $$8 = $$1.bp();

            for (bii $$9 : $$7) {
               egy $$10 = $$9.cG().g((double)$$9.bD());
               if ($$10.d($$8)) {
                  return bgr.c($$3);
               }
            }
         }

         if ($$4.c() == ehb.a.b) {
            cdf $$11 = this.a($$0, $$4);
            $$11.a(this.b);
            $$11.r($$1.dA());
            if (!$$0.a($$11, $$11.cG())) {
               return bgr.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, djj.t, $$4.e());
                  if (!$$1.fR().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(apg.c.b(this));
               return bgr.a($$3, $$0.r_());
            }
         } else {
            return bgr.c($$3);
         }
      }
   }

   private cdf a(cpl $$0, ehb $$1) {
      return (cdf)(this.c ? new cdg($$0, $$1.e().c, $$1.e().d, $$1.e().e) : new cdf($$0, $$1.e().c, $$1.e().d, $$1.e().e));
   }
}
