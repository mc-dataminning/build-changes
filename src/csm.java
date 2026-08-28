import java.util.List;
import java.util.function.Predicate;

public class csm extends cui {
   private static final Predicate<bss> a = bsx.f.and(bss::bz);
   private final cot.b b;
   private final boolean c;

   public csm(boolean $$0, cot.b $$1, cui.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      evn $$4 = a($$0, $$1, dbf.b.c);
      if ($$4.c() == evn.a.a) {
         return bqt.c($$3);
      } else {
         evp $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bss> $$7 = $$0.a($$1, $$1.cK().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            evp $$8 = $$1.bx();

            for (bss $$9 : $$7) {
               evk $$10 = $$9.cK().g((double)$$9.bK());
               if ($$10.d($$8)) {
                  return bqt.c($$3);
               }
            }
         }

         if ($$4.c() == evn.a.b) {
            cot $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dF());
            if (!$$0.a($$11, $$11.cK())) {
               return bqt.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dwt.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(awj.c.b(this));
               return bqt.a($$3, $$0.x_());
            }
         } else {
            return bqt.c($$3);
         }
      }
   }

   private cot a(dbw $$0, evn $$1, cun $$2, cmv $$3) {
      evp $$4 = $$1.e();
      cot $$5 = (cot)(this.c ? new cou($$0, $$4.c, $$4.d, $$4.e) : new cot($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof are $$6) {
         bsy.<cot>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
