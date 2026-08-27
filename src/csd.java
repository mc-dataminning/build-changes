import java.util.List;
import java.util.function.Predicate;

public class csd extends cuc {
   private static final Predicate<brv> a = bsa.f.and(brv::bE);
   private final cny.b b;
   private final boolean c;

   public csd(boolean $$0, cny.b $$1, cuc.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      ews $$4 = a($$0, $$1, dbj.b.c);
      if ($$4.c() == ews.a.a) {
         return bqb.c($$3);
      } else {
         ewu $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<brv> $$7 = $$0.a($$1, $$1.cP().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ewu $$8 = $$1.bC();

            for (brv $$9 : $$7) {
               ewp $$10 = $$9.cP().g((double)$$9.bP());
               if ($$10.d($$8)) {
                  return bqb.c($$3);
               }
            }
         }

         if ($$4.c() == ews.a.b) {
            cny $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dK());
            if (!$$0.b($$11, $$11.cP())) {
               return bqb.d($$3);
            } else {
               if (!$$0.C) {
                  $$0.b($$11);
                  $$0.a($$1, dxv.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(avz.c.b(this));
               return bqb.a($$3, $$0.x_());
            }
         } else {
            return bqb.c($$3);
         }
      }
   }

   private cny a(dca $$0, ews $$1, cuh $$2, cly $$3) {
      ewu $$4 = $$1.e();
      cny $$5 = (cny)(this.c ? new cnz($$0, $$4.c, $$4.d, $$4.e) : new cny($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aqt $$6) {
         bsb.<cny>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
