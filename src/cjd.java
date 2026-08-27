import java.util.List;
import java.util.function.Predicate;

public class cjd extends cle {
   private static final Predicate<bkq> a = bkt.f.and(bkq::bt);
   private final cfn.b b;
   private final boolean c;

   public cjd(boolean $$0, cfn.b $$1, cle.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      ejs $$4 = a($$0, $$1, crj.b.c);
      if ($$4.c() == ejs.a.a) {
         return biy.c($$3);
      } else {
         eju $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bkq> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            eju $$8 = $$1.br();

            for (bkq $$9 : $$7) {
               ejp $$10 = $$9.cH().g((double)$$9.bE());
               if ($$10.d($$8)) {
                  return biy.c($$3);
               }
            }
         }

         if ($$4.c() == ejs.a.b) {
            cfn $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dD());
            if (!$$0.a($$11, $$11.cH())) {
               return biy.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dls.t, $$4.e());
                  if (!$$1.fU().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(arb.c.b(this));
               return biy.a($$3, $$0.x_());
            }
         } else {
            return biy.c($$3);
         }
      }
   }

   private cfn a(csa $$0, ejs $$1, clj $$2, cdu $$3) {
      eju $$4 = $$1.e();
      cfn $$5 = (cfn)(this.c ? new cfo($$0, $$4.c, $$4.d, $$4.e) : new cfn($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof ame $$6) {
         bku.<cfn>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
