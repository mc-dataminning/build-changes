import java.util.List;
import java.util.function.Predicate;

public class csc extends ctx {
   private static final Predicate<bsg> a = bsl.f.and(bsg::bA);
   private final coh.b b;
   private final boolean c;

   public csc(boolean $$0, coh.b $$1, ctx.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      ewd $$4 = a($$0, $$1, dbo.b.c);
      if ($$4.c() == ewd.a.a) {
         return bqh.c($$3);
      } else {
         ewf $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bsg> $$7 = $$0.a($$1, $$1.cL().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ewf $$8 = $$1.by();

            for (bsg $$9 : $$7) {
               ewa $$10 = $$9.cL().g((double)$$9.bL());
               if ($$10.d($$8)) {
                  return bqh.c($$3);
               }
            }
         }

         if ($$4.c() == ewd.a.b) {
            coh $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.s($$1.dG());
            if (!$$0.a($$11, $$11.cL())) {
               return bqh.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dxg.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(avr.c.b(this));
               return bqh.a($$3, $$0.x_());
            }
         } else {
            return bqh.c($$3);
         }
      }
   }

   private coh a(dcf $$0, ewd $$1, cuc $$2, cmk $$3) {
      ewf $$4 = $$1.e();
      coh $$5 = (coh)(this.c ? new coi($$0, $$4.c, $$4.d, $$4.e) : new coh($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aqm $$6) {
         bsm.<coh>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
