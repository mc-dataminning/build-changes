import java.util.List;
import java.util.function.Predicate;

public class cnm extends cpl {
   private static final Predicate<bof> a = bok.f.and(bof::bt);
   private final cjv.b b;
   private final boolean c;

   public cnm(boolean $$0, cjv.b $$1, cpl.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      eot $$4 = a($$0, $$1, cvn.b.c);
      if ($$4.c() == eot.a.a) {
         return bmm.c($$3);
      } else {
         eov $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bof> $$7 = $$0.a($$1, $$1.cE().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            eov $$8 = $$1.br();

            for (bof $$9 : $$7) {
               eoq $$10 = $$9.cE().g((double)$$9.bE());
               if ($$10.d($$8)) {
                  return bmm.c($$3);
               }
            }
         }

         if ($$4.c() == eot.a.b) {
            cjv $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dz());
            if (!$$0.a($$11, $$11.cE())) {
               return bmm.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dqr.t, $$4.e());
                  if (!$$1.fW().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(atz.c.b(this));
               return bmm.a($$3, $$0.y_());
            }
         } else {
            return bmm.c($$3);
         }
      }
   }

   private cjv a(cwe $$0, eot $$1, cpq $$2, cia $$3) {
      eov $$4 = $$1.e();
      cjv $$5 = (cjv)(this.c ? new cjw($$0, $$4.c, $$4.d, $$4.e) : new cjv($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof apa $$6) {
         bol.<cjv>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
