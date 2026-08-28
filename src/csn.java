import java.util.List;
import java.util.function.Predicate;

public class csn extends cuj {
   private static final Predicate<bsq> a = bsv.f.and(bsq::bA);
   private final cot.b b;
   private final boolean c;

   public csn(boolean $$0, cot.b $$1, cuj.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      ewu $$4 = a($$0, $$1, dcd.b.c);
      if ($$4.c() == ewu.a.a) {
         return bqr.c($$3);
      } else {
         eww $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bsq> $$7 = $$0.a($$1, $$1.cL().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            eww $$8 = $$1.by();

            for (bsq $$9 : $$7) {
               ewr $$10 = $$9.cL().g((double)$$9.bL());
               if ($$10.d($$8)) {
                  return bqr.c($$3);
               }
            }
         }

         if ($$4.c() == ewu.a.b) {
            cot $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.s($$1.dG());
            if (!$$0.a($$11, $$11.cL())) {
               return bqr.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dxw.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(avy.c.b(this));
               return bqr.a($$3, $$0.x_());
            }
         } else {
            return bqr.c($$3);
         }
      }
   }

   private cot a(dcu $$0, ewu $$1, cuo $$2, cmv $$3) {
      eww $$4 = $$1.e();
      cot $$5 = (cot)(this.c ? new cou($$0, $$4.c, $$4.d, $$4.e) : new cot($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aqt $$6) {
         bsw.<cot>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
