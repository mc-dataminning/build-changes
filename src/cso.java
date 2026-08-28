import java.util.List;
import java.util.function.Predicate;

public class cso extends cuk {
   private static final Predicate<bsu> a = bsz.f.and(bsu::bz);
   private final cov.b b;
   private final boolean c;

   public cso(boolean $$0, cov.b $$1, cuk.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      evp $$4 = a($$0, $$1, dbh.b.c);
      if ($$4.c() == evp.a.a) {
         return bqv.c($$3);
      } else {
         evr $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bsu> $$7 = $$0.a($$1, $$1.cK().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            evr $$8 = $$1.bx();

            for (bsu $$9 : $$7) {
               evm $$10 = $$9.cK().g((double)$$9.bK());
               if ($$10.d($$8)) {
                  return bqv.c($$3);
               }
            }
         }

         if ($$4.c() == evp.a.b) {
            cov $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dF());
            if (!$$0.a($$11, $$11.cK())) {
               return bqv.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dwv.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(awk.c.b(this));
               return bqv.a($$3, $$0.x_());
            }
         } else {
            return bqv.c($$3);
         }
      }
   }

   private cov a(dby $$0, evp $$1, cup $$2, cmx $$3) {
      evr $$4 = $$1.e();
      cov $$5 = (cov)(this.c ? new cow($$0, $$4.c, $$4.d, $$4.e) : new cov($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof arf $$6) {
         bta.<cov>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
