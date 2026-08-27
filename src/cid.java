import java.util.List;
import java.util.function.Predicate;

public class cid extends cke {
   private static final Predicate<bjt> a = bjw.f.and(bjt::br);
   private final ceq.b b;
   private final boolean c;

   public cid(boolean $$0, ceq.b $$1, cke.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      eid $$4 = a($$0, $$1, cqi.b.c);
      if ($$4.c() == eid.a.a) {
         return bic.c($$3);
      } else {
         eif $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bjt> $$7 = $$0.a($$1, $$1.cG().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            eif $$8 = $$1.bp();

            for (bjt $$9 : $$7) {
               eia $$10 = $$9.cG().g((double)$$9.bD());
               if ($$10.d($$8)) {
                  return bic.c($$3);
               }
            }
         }

         if ($$4.c() == eid.a.b) {
            ceq $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dB());
            if (!$$0.a($$11, $$11.cG())) {
               return bic.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dkl.t, $$4.e());
                  if (!$$1.fT().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(aqn.c.b(this));
               return bic.a($$3, $$0.x_());
            }
         } else {
            return bic.c($$3);
         }
      }
   }

   private ceq a(cqz $$0, eid $$1, ckj $$2, ccx $$3) {
      eif $$4 = $$1.e();
      ceq $$5 = (ceq)(this.c ? new cer($$0, $$4.c, $$4.d, $$4.e) : new ceq($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof alq $$6) {
         bjx.<ceq>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
