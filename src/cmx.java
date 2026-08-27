import java.util.List;
import java.util.function.Predicate;

public class cmx extends coy {
   private static final Predicate<bnq> a = bnv.f.and(bnq::bt);
   private final cjg.b b;
   private final boolean c;

   public cmx(boolean $$0, cjg.b $$1, coy.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      enx $$4 = a($$0, $$1, cva.b.c);
      if ($$4.c() == enx.a.a) {
         return blx.c($$3);
      } else {
         enz $$5 = $$1.f(1.0F);
         double $$6 = 5.0;
         List<bnq> $$7 = $$0.a($$1, $$1.cH().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            enz $$8 = $$1.br();

            for (bnq $$9 : $$7) {
               enu $$10 = $$9.cH().g((double)$$9.bE());
               if ($$10.d($$8)) {
                  return blx.c($$3);
               }
            }
         }

         if ($$4.c() == enx.a.b) {
            cjg $$11 = this.a($$0, $$4, $$3, $$1);
            $$11.a(this.b);
            $$11.r($$1.dC());
            if (!$$0.a($$11, $$11.cH())) {
               return blx.d($$3);
            } else {
               if (!$$0.B) {
                  $$0.b($$11);
                  $$0.a($$1, dpw.t, $$4.e());
                  if (!$$1.fU().d) {
                     $$3.h(1);
                  }
               }

               $$1.b(atv.c.b(this));
               return blx.a($$3, $$0.y_());
            }
         } else {
            return blx.c($$3);
         }
      }
   }

   private cjg a(cvr $$0, enx $$1, cpd $$2, chl $$3) {
      enz $$4 = $$1.e();
      cjg $$5 = (cjg)(this.c ? new cjh($$0, $$4.c, $$4.d, $$4.e) : new cjg($$0, $$4.c, $$4.d, $$4.e));
      if ($$0 instanceof aow $$6) {
         bnw.<cjg>a($$6, $$2, $$3).accept($$5);
      }

      return $$5;
   }
}
