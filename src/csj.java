import java.util.List;
import java.util.function.Predicate;

public class csj extends cuf {
   private static final Predicate<bsp> a = bsu.f.and(bsp::bz);
   private final coq.b b;
   private final boolean c;

   public csj(boolean $$0, coq.b $$1, cuf.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      evk $$4 = a($$0, $$1, dbc.b.c);
      if ($$4.c() == evk.a.a) {
         return bqq.c($$3);
      } else {
         evm $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bsp> $$7 = $$0.a($$1, $$1.cK().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            evm $$8 = $$1.bx();

            for (bsp $$9 : $$7) {
               evh $$10 = $$9.cK().g((double)$$9.bK());
               if ($$10.d($$8)) {
                  return bqq.c($$3);
               }
            }
         }

         if ($$4.c() == evk.a.b) {
            coq $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dF());
            if (!$$0.a($$11, $$11.cK())) {
               return bqq.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dwq.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(awg.c.b(this));
               return bqq.a($$3, $$0.x_());
            }
         } else {
            return bqq.c($$3);
         }
      }
   }

   private coq a(dbt $$0, evk $$1, cuk $$2, cms $$3) {
      evm $$4 = $$1.e();
      coq $$5 = (coq)(this.c ? new cor($$0, $$4.c, $$4.d, $$4.e) : new coq($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof arb $$6) {
         bsv.<coq>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
