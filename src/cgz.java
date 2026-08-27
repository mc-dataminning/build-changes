import java.util.List;
import java.util.function.Predicate;

public class cgz extends cja {
   private static final Predicate<biq> a = bit.f.and(biq::br);
   private final cdn.b b;
   private final boolean c;

   public cgz(boolean $$0, cdn.b $$1, cja.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      ehl $$4 = a($$0, $$1, cpe.b.c);
      if ($$4.c() == ehl.a.a) {
         return bgz.c($$3);
      } else {
         ehn $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<biq> $$7 = $$0.a($$1, $$1.cG().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ehn $$8 = $$1.bp();

            for (biq $$9 : $$7) {
               ehi $$10 = $$9.cG().g((double)$$9.bD());
               if ($$10.d($$8)) {
                  return bgz.c($$3);
               }
            }
         }

         if ($$4.c() == ehl.a.b) {
            cdn $$11 = this.a($$0, $$4);
            $$11.a(this.b);
            $$11.r($$1.dB());
            if (!$$0.a($$11, $$11.cG())) {
               return bgz.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, djt.t, $$4.e());
                  if (!$$1.fS().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(apo.c.b(this));
               return bgz.a($$3, $$0.w_());
            }
         } else {
            return bgz.c($$3);
         }
      }
   }

   private cdn a(cpv $$0, ehl $$1) {
      return (cdn)(this.c ? new cdo($$0, $$1.e().c, $$1.e().d, $$1.e().e) : new cdn($$0, $$1.e().c, $$1.e().d, $$1.e().e));
   }
}
