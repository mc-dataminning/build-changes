import java.util.List;
import java.util.function.Predicate;

public class csp extends cul {
   private static final Predicate<bsv> a = bta.f.and(bsv::bz);
   private final cow.b b;
   private final boolean c;

   public csp(boolean $$0, cow.b $$1, cul.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqw<cuq> a(dbz $$0, cmy $$1, bqu $$2) {
      cuq $$3 = $$1.b($$2);
      evq $$4 = a($$0, $$1, dbi.b.c);
      if ($$4.c() == evq.a.a) {
         return bqw.c($$3);
      } else {
         evs $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bsv> $$7 = $$0.a($$1, $$1.cK().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            evs $$8 = $$1.bx();

            for (bsv $$9 : $$7) {
               evn $$10 = $$9.cK().g((double)$$9.bK());
               if ($$10.d($$8)) {
                  return bqw.c($$3);
               }
            }
         }

         if ($$4.c() == evq.a.b) {
            cow $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dF());
            if (!$$0.a($$11, $$11.cK())) {
               return bqw.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dww.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(awk.c.b(this));
               return bqw.a($$3, $$0.x_());
            }
         } else {
            return bqw.c($$3);
         }
      }
   }

   private cow a(dbz $$0, evq $$1, cuq $$2, cmy $$3) {
      evs $$4 = $$1.e();
      cow $$5 = (cow)(this.c ? new cox($$0, $$4.c, $$4.d, $$4.e) : new cow($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof arf $$6) {
         btb.<cow>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
