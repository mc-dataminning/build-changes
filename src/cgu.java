import java.util.List;
import java.util.function.Predicate;

public class cgu extends civ {
   private static final Predicate<bil> a = bio.f.and(bil::br);
   private final cdi.b b;
   private final boolean c;

   public cgu(boolean $$0, cdi.b $$1, civ.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      ehg $$4 = a($$0, $$1, coz.b.c);
      if ($$4.c() == ehg.a.a) {
         return bgu.c($$3);
      } else {
         ehi $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bil> $$7 = $$0.a($$1, $$1.cG().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ehi $$8 = $$1.bp();

            for (bil $$9 : $$7) {
               ehd $$10 = $$9.cG().g((double)$$9.bD());
               if ($$10.d($$8)) {
                  return bgu.c($$3);
               }
            }
         }

         if ($$4.c() == ehg.a.b) {
            cdi $$11 = this.a($$0, $$4);
            $$11.a(this.b);
            $$11.r($$1.dA());
            if (!$$0.a($$11, $$11.cG())) {
               return bgu.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, djo.t, $$4.e());
                  if (!$$1.fR().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(apj.c.b(this));
               return bgu.a($$3, $$0.r_());
            }
         } else {
            return bgu.c($$3);
         }
      }
   }

   private cdi a(cpq $$0, ehg $$1) {
      return (cdi)(this.c ? new cdj($$0, $$1.e().c, $$1.e().d, $$1.e().e) : new cdi($$0, $$1.e().c, $$1.e().d, $$1.e().e));
   }
}
