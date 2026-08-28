import java.util.List;
import javax.annotation.Nullable;

public class cwg extends cxu {
   private final bwb<? extends csf> a;

   public cwg(bwb<? extends csf> $$0, cxu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      fcs $$4 = a($$0, $$1, dgy.b.c);
      if ($$4.d() == fcs.a.a) {
         return btq.e;
      } else {
         fcu $$5 = $$1.h(1.0F);
         double $$6 = 5.0;
         List<bvs> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bvz.h);
         if (!$$7.isEmpty()) {
            fcu $$8 = $$1.bE();

            for (bvs $$9 : $$7) {
               fcp $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return btq.e;
               }
            }
         }

         if ($$4.d() == fcs.a.b) {
            csf $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return btq.d;
            } else {
               $$11.w($$1.dL());
               if (!$$0.a($$11, $$11.cR())) {
                  return btq.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, edm.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(awu.c.b(this));
                  return btq.a;
               }
            }
         } else {
            return btq.e;
         }
      }
   }

   @Nullable
   private csf a(dhp $$0, fcs $$1, cxy $$2, cqi $$3) {
      csf $$4 = this.a.a($$0, bwa.m);
      if ($$4 != null) {
         fcu $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof arn $$6) {
            bwb.<csf>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
