import java.util.List;
import java.util.function.Predicate;

public class csp extends cul {
   private static final Predicate<bsr> a = bsw.f.and(bsr::bA);
   private final cov.b b;
   private final boolean c;

   public csp(boolean $$0, cov.b $$1, cul.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      exa $$4 = a($$0, $$1, dcf.b.c);
      if ($$4.c() == exa.a.a) {
         return bqs.c($$3);
      } else {
         exc $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bsr> $$7 = $$0.a($$1, $$1.cK().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            exc $$8 = $$1.by();

            for (bsr $$9 : $$7) {
               ewx $$10 = $$9.cK().g((double)$$9.bL());
               if ($$10.d($$8)) {
                  return bqs.c($$3);
               }
            }
         }

         if ($$4.c() == exa.a.b) {
            cov $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.t($$1.dE());
            if (!$$0.a($$11, $$11.cK())) {
               return bqs.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dxz.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(avz.c.b(this));
               return bqs.a($$3, $$0.x_());
            }
         } else {
            return bqs.c($$3);
         }
      }
   }

   private cov a(dcw $$0, exa $$1, cuq $$2, cmx $$3) {
      exc $$4 = $$1.e();
      cov $$5 = (cov)(this.c ? new cow($$0, $$4.c, $$4.d, $$4.e) : new cov($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aqu $$6) {
         bsx.<cov>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
