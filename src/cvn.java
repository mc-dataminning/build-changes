import java.util.List;
import javax.annotation.Nullable;

public class cvn extends cxc {
   private final bvi<? extends crl> a;

   public cvn(bvi<? extends crl> $$0, cxc.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      fbp $$4 = a($$0, $$1, dgh.b.c);
      if ($$4.d() == fbp.a.a) {
         return bta.e;
      } else {
         fbr $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bvb> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bvg.h);
         if (!$$7.isEmpty()) {
            fbr $$8 = $$1.bF();

            for (bvb $$9 : $$7) {
               fbm $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return bta.e;
               }
            }
         }

         if ($$4.d() == fbp.a.b) {
            crl $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bta.d;
            } else {
               $$11.v($$1.dM());
               if (!$$0.a($$11, $$11.cR())) {
                  return bta.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, eck.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(axf.c.b(this));
                  return bta.a;
               }
            }
         } else {
            return bta.e;
         }
      }
   }

   @Nullable
   private crl a(dgz $$0, fbp $$1, cxg $$2, cpo $$3) {
      crl $$4 = this.a.a($$0, bvh.m);
      if ($$4 != null) {
         fbr $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof arx $$6) {
            bvi.<crl>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
