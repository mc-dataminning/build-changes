import java.util.List;
import java.util.function.Predicate;

public class cqc extends cry {
   private static final Predicate<bql> a = bqq.f.and(bql::bx);
   private final cmi.b b;
   private final boolean c;

   public cqc(boolean $$0, cmi.b $$1, cry.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      etd $$4 = a($$0, $$1, czd.b.c);
      if ($$4.c() == etd.a.a) {
         return bor.c($$3);
      } else {
         etf $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bql> $$7 = $$0.a($$1, $$1.cI().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            etf $$8 = $$1.bv();

            for (bql $$9 : $$7) {
               eta $$10 = $$9.cI().g((double)$$9.bI());
               if ($$10.d($$8)) {
                  return bor.c($$3);
               }
            }
         }

         if ($$4.c() == etd.a.b) {
            cmi $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dD());
            if (!$$0.a($$11, $$11.cI())) {
               return bor.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dur.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(avj.c.b(this));
               return bor.a($$3, $$0.x_());
            }
         } else {
            return bor.c($$3);
         }
      }
   }

   private cmi a(czu $$0, etd $$1, csd $$2, ckl $$3) {
      etf $$4 = $$1.e();
      cmi $$5 = (cmi)(this.c ? new cmj($$0, $$4.c, $$4.d, $$4.e) : new cmi($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aqe $$6) {
         bqr.<cmi>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
