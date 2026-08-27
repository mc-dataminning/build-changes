import javax.annotation.Nullable;

public interface chz extends cks {
   bin g();

   default aov ak_() {
      return aow.af;
   }

   default bgr<ciy> a(cit $$0, cpm $$1, cbn $$2, bgp $$3) {
      ciy $$4 = $$2.b($$3);
      bin $$5 = bja.h($$4);
      ciy $$6 = $$2.c($$5);
      if ((!cnh.d($$6) || $$2.f()) && !ciy.a($$4, $$6)) {
         if (!$$1.r_()) {
            $$2.b(apg.c.b($$0));
         }

         ciy $$7 = $$6.b() ? $$4 : $$6.c();
         ciy $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bgr.a($$7, $$1.r_());
      } else {
         return bgr.d($$4);
      }
   }

   @Nullable
   static chz c_(ciy $$0) {
      cit $$3 = $$0.d();
      if ($$3 instanceof chz) {
         return (chz)$$3;
      } else {
         if ($$0.d() instanceof cgr $$2) {
            csm var6 = $$2.e();
            if (var6 instanceof chz) {
               return (chz)var6;
            }
         }

         return null;
      }
   }
}
