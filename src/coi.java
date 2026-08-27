import java.util.List;
import java.util.function.Predicate;

public class coi extends cqh {
   private static final Predicate<box> a = bpc.f.and(box::bw);
   private final ckr.b b;
   private final boolean c;

   public coi(boolean $$0, ckr.b $$1, cqh.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      epr $$4 = a($$0, $$1, cwk.b.c);
      if ($$4.c() == epr.a.a) {
         return bne.c($$3);
      } else {
         ept $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<box> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            ept $$8 = $$1.bu();

            for (box $$9 : $$7) {
               epo $$10 = $$9.cH().g((double)$$9.bH());
               if ($$10.d($$8)) {
                  return bne.c($$3);
               }
            }
         }

         if ($$4.c() == epr.a.b) {
            ckr $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dC());
            if (!$$0.a($$11, $$11.cH())) {
               return bne.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, drp.t, $$4.e());
                  $$3.a(1, $$1);
               }

               $$1.b(aui.c.b(this));
               return bne.a($$3, $$0.x_());
            }
         } else {
            return bne.c($$3);
         }
      }
   }

   private ckr a(cxb $$0, epr $$1, cqm $$2, ciu $$3) {
      ept $$4 = $$1.e();
      ckr $$5 = (ckr)(this.c ? new cks($$0, $$4.c, $$4.d, $$4.e) : new ckr($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof apf $$6) {
         bpd.<ckr>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
