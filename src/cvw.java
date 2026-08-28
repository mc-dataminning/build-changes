import java.util.List;
import javax.annotation.Nullable;

public class cvw extends cxl {
   private final bvr<? extends cru> a;

   public cvw(bvr<? extends cru> $$0, cxl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      cxp $$3 = $$1.b($$2);
      fbw $$4 = a($$0, $$1, dgq.b.c);
      if ($$4.d() == fbw.a.a) {
         return btj.e;
      } else {
         fby $$5 = $$1.g(1.0F);
         double $$6 = 5.0;
         List<bvk> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bvp.h);
         if (!$$7.isEmpty()) {
            fby $$8 = $$1.bF();

            for (bvk $$9 : $$7) {
               fbt $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return btj.e;
               }
            }
         }

         if ($$4.d() == fbw.a.b) {
            cru $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return btj.d;
            } else {
               $$11.v($$1.dM());
               if (!$$0.a($$11, $$11.cR())) {
                  return btj.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, ecr.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(axp.c.b(this));
                  return btj.a;
               }
            }
         } else {
            return btj.e;
         }
      }
   }

   @Nullable
   private cru a(dhi $$0, fbw $$1, cxp $$2, cpx $$3) {
      cru $$4 = this.a.a($$0, bvq.m);
      if ($$4 != null) {
         fby $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof ash $$6) {
            bvr.<cru>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
