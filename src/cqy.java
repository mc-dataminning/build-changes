import java.util.List;
import java.util.function.Predicate;

public class cqy extends csu {
   private static final Predicate<brh> a = brm.f.and(brh::bx);
   private final cne.b b;
   private final boolean c;

   public cqy(boolean $$0, cne.b $$1, csu.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      etn $$4 = a($$0, $$1, czm.b.c);
      if ($$4.c() == etn.a.a) {
         return bpn.c($$3);
      } else {
         etp $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<brh> $$7 = $$0.a($$1, $$1.cI().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            etp $$8 = $$1.bv();

            for (brh $$9 : $$7) {
               etk $$10 = $$9.cI().g((double)$$9.bI());
               if ($$10.d($$8)) {
                  return bpn.c($$3);
               }
            }
         }

         if ($$4.c() == etn.a.b) {
            cne $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dD());
            if (!$$0.a($$11, $$11.cI())) {
               return bpn.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dva.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(avm.c.b(this));
               return bpn.a($$3, $$0.x_());
            }
         } else {
            return bpn.c($$3);
         }
      }
   }

   private cne a(dad $$0, etn $$1, csz $$2, clh $$3) {
      etp $$4 = $$1.e();
      cne $$5 = (cne)(this.c ? new cnf($$0, $$4.c, $$4.d, $$4.e) : new cne($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aqh $$6) {
         brn.<cne>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
