import java.util.List;
import javax.annotation.Nullable;

public class cvr extends cxg {
   private final bvm<? extends crp> a;

   public cvr(bvm<? extends crp> $$0, cxg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      fbq $$4 = a($$0, $$1, dgi.b.c);
      if ($$4.d() == fbq.a.a) {
         return bte.e;
      } else {
         fbs $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bvf> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bvk.h);
         if (!$$7.isEmpty()) {
            fbs $$8 = $$1.bF();

            for (bvf $$9 : $$7) {
               fbn $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return bte.e;
               }
            }
         }

         if ($$4.d() == fbq.a.b) {
            crp $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bte.d;
            } else {
               $$11.v($$1.dL());
               if (!$$0.a($$11, $$11.cR())) {
                  return bte.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, ecj.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(axp.c.b(this));
                  return bte.a;
               }
            }
         } else {
            return bte.e;
         }
      }
   }

   @Nullable
   private crp a(dha $$0, fbq $$1, cxk $$2, cps $$3) {
      crp $$4 = this.a.a($$0, bvl.m);
      if ($$4 != null) {
         fbs $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof ash $$6) {
            bvm.<crp>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
