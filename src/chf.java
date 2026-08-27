import java.util.List;
import java.util.function.Predicate;

public class chf extends cjg {
   private static final Predicate<biw> a = biz.f.and(biw::br);
   private final cdt.b b;
   private final boolean c;

   public chf(boolean $$0, cdt.b $$1, cjg.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      ehf $$4 = a($$0, $$1, cpk.b.c);
      if ($$4.c() == ehf.a.a) {
         return bhf.c($$3);
      } else {
         ehh $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<biw> $$7 = $$0.a($$1, $$1.cG().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ehh $$8 = $$1.bp();

            for (biw $$9 : $$7) {
               ehc $$10 = $$9.cG().g((double)$$9.bD());
               if ($$10.d($$8)) {
                  return bhf.c($$3);
               }
            }
         }

         if ($$4.c() == ehf.a.b) {
            cdt $$11 = this.a($$0, $$4);
            $$11.a(this.b);
            $$11.r($$1.dB());
            if (!$$0.a($$11, $$11.cG())) {
               return bhf.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, djn.t, $$4.e());
                  if (!$$1.fT().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(apq.c.b(this));
               return bhf.a($$3, $$0.w_());
            }
         } else {
            return bhf.c($$3);
         }
      }
   }

   private cdt a(cqb $$0, ehf $$1) {
      return (cdt)(this.c ? new cdu($$0, $$1.e().c, $$1.e().d, $$1.e().e) : new cdt($$0, $$1.e().c, $$1.e().d, $$1.e().e));
   }
}
