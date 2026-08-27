import java.util.List;
import java.util.function.Predicate;

public class cks extends cmt {
   private static final Predicate<blv> a = bly.f.and(blv::bt);
   private final chc.b b;
   private final boolean c;

   public cks(boolean $$0, chc.b $$1, cmt.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      cmy $$3 = $$1.b($$2);
      elr $$4 = a($$0, $$1, csy.b.c);
      if ($$4.c() == elr.a.a) {
         return bkc.c($$3);
      } else {
         elt $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<blv> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            elt $$8 = $$1.br();

            for (blv $$9 : $$7) {
               elo $$10 = $$9.cH().g((double)$$9.bE());
               if ($$10.d($$8)) {
                  return bkc.c($$3);
               }
            }
         }

         if ($$4.c() == elr.a.b) {
            chc $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dC());
            if (!$$0.a($$11, $$11.cH())) {
               return bkc.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dnr.t, $$4.e());
                  if (!$$1.fT().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(asc.c.b(this));
               return bkc.a($$3, $$0.y_());
            }
         } else {
            return bkc.c($$3);
         }
      }
   }

   private chc a(ctp $$0, elr $$1, cmy $$2, cfi $$3) {
      elt $$4 = $$1.e();
      chc $$5 = (chc)(this.c ? new chd($$0, $$4.c, $$4.d, $$4.e) : new chc($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof and $$6) {
         blz.<chc>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
