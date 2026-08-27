import javax.annotation.Nullable;

public interface chy extends ckr {
   bin g();

   default aov aj_() {
      return aow.af;
   }

   default bgr<cix> a(cis $$0, cpl $$1, cbm $$2, bgp $$3) {
      cix $$4 = $$2.b($$3);
      bin $$5 = bja.h($$4);
      cix $$6 = $$2.c($$5);
      if ((!cng.d($$6) || $$2.f()) && !cix.a($$4, $$6)) {
         if (!$$1.r_()) {
            $$2.b(apg.c.b($$0));
         }

         cix $$7 = $$6.b() ? $$4 : $$6.c();
         cix $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bgr.a($$7, $$1.r_());
      } else {
         return bgr.d($$4);
      }
   }

   @Nullable
   static chy c_(cix $$0) {
      cis $$3 = $$0.d();
      if ($$3 instanceof chy) {
         return (chy)$$3;
      } else {
         if ($$0.d() instanceof cgq $$2) {
            csl var6 = $$2.e();
            if (var6 instanceof chy) {
               return (chy)var6;
            }
         }

         return null;
      }
   }
}
