import java.util.List;
import java.util.function.Predicate;

public class csq extends cum {
   private static final Predicate<bsw> a = btb.f.and(bsw::bz);
   private final cox.b b;
   private final boolean c;

   public csq(boolean $$0, cox.b $$1, cum.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      evr $$4 = a($$0, $$1, dbj.b.c);
      if ($$4.c() == evr.a.a) {
         return bqx.c($$3);
      } else {
         evt $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bsw> $$7 = $$0.a($$1, $$1.cK().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            evt $$8 = $$1.bx();

            for (bsw $$9 : $$7) {
               evo $$10 = $$9.cK().g((double)$$9.bK());
               if ($$10.d($$8)) {
                  return bqx.c($$3);
               }
            }
         }

         if ($$4.c() == evr.a.b) {
            cox $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dF());
            if (!$$0.a($$11, $$11.cK())) {
               return bqx.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dwx.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(awk.c.b(this));
               return bqx.a($$3, $$0.x_());
            }
         } else {
            return bqx.c($$3);
         }
      }
   }

   private cox a(dca $$0, evr $$1, cur $$2, cmz $$3) {
      evt $$4 = $$1.e();
      cox $$5 = (cox)(this.c ? new coy($$0, $$4.c, $$4.d, $$4.e) : new cox($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof arf $$6) {
         btc.<cox>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
