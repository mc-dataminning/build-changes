import java.util.List;
import java.util.function.Predicate;

public class csn extends cuj {
   private static final Predicate<bst> a = bsy.f.and(bst::bz);
   private final cou.b b;
   private final boolean c;

   public csn(boolean $$0, cou.b $$1, cuj.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      evo $$4 = a($$0, $$1, dbg.b.c);
      if ($$4.c() == evo.a.a) {
         return bqu.c($$3);
      } else {
         evq $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bst> $$7 = $$0.a($$1, $$1.cK().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            evq $$8 = $$1.bx();

            for (bst $$9 : $$7) {
               evl $$10 = $$9.cK().g((double)$$9.bK());
               if ($$10.d($$8)) {
                  return bqu.c($$3);
               }
            }
         }

         if ($$4.c() == evo.a.b) {
            cou $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dF());
            if (!$$0.a($$11, $$11.cK())) {
               return bqu.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dwu.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(awj.c.b(this));
               return bqu.a($$3, $$0.x_());
            }
         } else {
            return bqu.c($$3);
         }
      }
   }

   private cou a(dbx $$0, evo $$1, cuo $$2, cmw $$3) {
      evq $$4 = $$1.e();
      cou $$5 = (cou)(this.c ? new cov($$0, $$4.c, $$4.d, $$4.e) : new cou($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof are $$6) {
         bsz.<cou>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
