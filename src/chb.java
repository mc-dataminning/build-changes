import java.util.List;
import java.util.function.Predicate;

public class chb extends cjc {
   private static final Predicate<bis> a = biv.f.and(bis::br);
   private final cdp.b b;
   private final boolean c;

   public chb(boolean $$0, cdp.b $$1, cjc.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      ehn $$4 = a($$0, $$1, cpg.b.c);
      if ($$4.c() == ehn.a.a) {
         return bhb.c($$3);
      } else {
         ehp $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bis> $$7 = $$0.a($$1, $$1.cG().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ehp $$8 = $$1.bp();

            for (bis $$9 : $$7) {
               ehk $$10 = $$9.cG().g((double)$$9.bD());
               if ($$10.d($$8)) {
                  return bhb.c($$3);
               }
            }
         }

         if ($$4.c() == ehn.a.b) {
            cdp $$11 = this.a($$0, $$4);
            $$11.a(this.b);
            $$11.r($$1.dB());
            if (!$$0.a($$11, $$11.cG())) {
               return bhb.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, djv.t, $$4.e());
                  if (!$$1.fS().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(app.c.b(this));
               return bhb.a($$3, $$0.w_());
            }
         } else {
            return bhb.c($$3);
         }
      }
   }

   private cdp a(cpx $$0, ehn $$1) {
      return (cdp)(this.c ? new cdq($$0, $$1.e().c, $$1.e().d, $$1.e().e) : new cdp($$0, $$1.e().c, $$1.e().d, $$1.e().e));
   }
}
