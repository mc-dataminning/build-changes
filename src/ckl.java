import java.util.List;
import java.util.function.Predicate;

public class ckl extends cmm {
   private static final Predicate<blp> a = bls.f.and(blp::bt);
   private final cgv.b b;
   private final boolean c;

   public ckl(boolean $$0, cgv.b $$1, cmm.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      elk $$4 = a($$0, $$1, csr.b.c);
      if ($$4.c() == elk.a.a) {
         return bjw.c($$3);
      } else {
         elm $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<blp> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            elm $$8 = $$1.br();

            for (blp $$9 : $$7) {
               elh $$10 = $$9.cH().g((double)$$9.bE());
               if ($$10.d($$8)) {
                  return bjw.c($$3);
               }
            }
         }

         if ($$4.c() == elk.a.b) {
            cgv $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dC());
            if (!$$0.a($$11, $$11.cH())) {
               return bjw.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dnk.t, $$4.e());
                  if (!$$1.fT().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(arw.c.b(this));
               return bjw.a($$3, $$0.y_());
            }
         } else {
            return bjw.c($$3);
         }
      }
   }

   private cgv a(cti $$0, elk $$1, cmr $$2, cfb $$3) {
      elm $$4 = $$1.e();
      cgv $$5 = (cgv)(this.c ? new cgw($$0, $$4.c, $$4.d, $$4.e) : new cgv($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof amz $$6) {
         blt.<cgv>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
