import javax.annotation.Nullable;

public interface cii extends clb {
   bix g();

   default ape ao_() {
      return apf.af;
   }

   default bhb<cjh> a(cjc $$0, cpx $$1, cbw $$2, bgz $$3) {
      cjh $$4 = $$2.b($$3);
      bix $$5 = bjk.h($$4);
      cjh $$6 = $$2.c($$5);
      if ((!cns.d($$6) || $$2.f()) && !cjh.a($$4, $$6)) {
         if (!$$1.w_()) {
            $$2.b(app.c.b($$0));
         }

         cjh $$7 = $$6.b() ? $$4 : $$6.c();
         cjh $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bhb.a($$7, $$1.w_());
      } else {
         return bhb.d($$4);
      }
   }

   @Nullable
   static cii c_(cjh $$0) {
      cjc $$3 = $$0.d();
      if ($$3 instanceof cii) {
         return (cii)$$3;
      } else {
         if ($$0.d() instanceof cha $$2) {
            csx var6 = $$2.e();
            if (var6 instanceof cii) {
               return (cii)var6;
            }
         }

         return null;
      }
   }
}
