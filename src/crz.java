import java.util.List;
import java.util.function.Predicate;

public class crz extends ctv {
   private static final Predicate<bsd> a = bsi.f.and(bsd::bz);
   private final coe.b b;
   private final boolean c;

   public crz(boolean $$0, coe.b $$1, ctv.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      evx $$4 = a($$0, $$1, dbm.b.c);
      if ($$4.c() == evx.a.a) {
         return bqe.c($$3);
      } else {
         evz $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bsd> $$7 = $$0.a($$1, $$1.cK().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            evz $$8 = $$1.bx();

            for (bsd $$9 : $$7) {
               evu $$10 = $$9.cK().g((double)$$9.bK());
               if ($$10.d($$8)) {
                  return bqe.c($$3);
               }
            }
         }

         if ($$4.c() == evx.a.b) {
            coe $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.s($$1.dF());
            if (!$$0.a($$11, $$11.cK())) {
               return bqe.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dxa.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(avp.c.b(this));
               return bqe.a($$3, $$0.x_());
            }
         } else {
            return bqe.c($$3);
         }
      }
   }

   private coe a(dcd $$0, evx $$1, cua $$2, cmh $$3) {
      evz $$4 = $$1.e();
      coe $$5 = (coe)(this.c ? new cof($$0, $$4.c, $$4.d, $$4.e) : new coe($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aqk $$6) {
         bsj.<coe>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
