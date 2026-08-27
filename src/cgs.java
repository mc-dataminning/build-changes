import java.util.List;
import java.util.function.Predicate;

public class cgs extends cit {
   private static final Predicate<bii> a = bil.f.and(bii::br);
   private final cdg.b b;
   private final boolean c;

   public cgs(boolean $$0, cdg.b $$1, cit.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      ehc $$4 = a($$0, $$1, cov.b.c);
      if ($$4.c() == ehc.a.a) {
         return bgr.c($$3);
      } else {
         ehe $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bii> $$7 = $$0.a($$1, $$1.cG().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ehe $$8 = $$1.bp();

            for (bii $$9 : $$7) {
               egz $$10 = $$9.cG().g((double)$$9.bD());
               if ($$10.d($$8)) {
                  return bgr.c($$3);
               }
            }
         }

         if ($$4.c() == ehc.a.b) {
            cdg $$11 = this.a($$0, $$4);
            $$11.a(this.b);
            $$11.r($$1.dA());
            if (!$$0.a($$11, $$11.cG())) {
               return bgr.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, djk.t, $$4.e());
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

   private cdg a(cpm $$0, ehc $$1) {
      return (cdg)(this.c ? new cdh($$0, $$1.e().c, $$1.e().d, $$1.e().e) : new cdg($$0, $$1.e().c, $$1.e().d, $$1.e().e));
   }
}
