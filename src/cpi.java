import java.util.List;
import java.util.function.Predicate;

public class cpi extends cre {
   private static final Predicate<bpv> a = bqa.f.and(bpv::bw);
   private final clq.b b;
   private final boolean c;

   public cpi(boolean $$0, clq.b $$1, cre.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      ery $$4 = a($$0, $$1, cyg.b.c);
      if ($$4.c() == ery.a.a) {
         return bob.c($$3);
      } else {
         esa $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bpv> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            esa $$8 = $$1.bu();

            for (bpv $$9 : $$7) {
               erv $$10 = $$9.cH().g((double)$$9.bH());
               if ($$10.d($$8)) {
                  return bob.c($$3);
               }
            }
         }

         if ($$4.c() == ery.a.b) {
            clq $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dC());
            if (!$$0.a($$11, $$11.cH())) {
               return bob.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dts.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(auw.c.b(this));
               return bob.a($$3, $$0.x_());
            }
         } else {
            return bob.c($$3);
         }
      }
   }

   private clq a(cyx $$0, ery $$1, crj $$2, cjt $$3) {
      esa $$4 = $$1.e();
      clq $$5 = (clq)(this.c ? new clr($$0, $$4.c, $$4.d, $$4.e) : new clq($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aps $$6) {
         bqb.<clq>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
