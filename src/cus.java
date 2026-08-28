import javax.annotation.Nullable;

public interface cus {
   btw l();

   default jn<awd> m() {
      return awe.as;
   }

   default brp a(cvk $$0, deg $$1, cnu $$2, bro $$3) {
      cvp $$4 = $$2.b($$3);
      btw $$5 = $$2.g($$4);
      if (!$$2.e($$5)) {
         return brp.e;
      } else {
         cvp $$6 = $$2.a($$5);
         if ((!dbm.a($$6, dbl.E) || $$2.f()) && !cvp.a($$4, $$6)) {
            if (!$$1.w_()) {
               $$2.b(awo.c.b($$0));
            }

            cvp $$7 = $$6.f() ? $$4 : $$6.g();
            cvp $$8 = $$2.f() ? $$4.u() : $$4.g();
            $$2.a($$5, $$8);
            return brp.a.a($$7);
         } else {
            return brp.d;
         }
      }
   }

   @Nullable
   static cus c_(cvp $$0) {
      cvk $$3 = $$0.h();
      if ($$3 instanceof cus) {
         return (cus)$$3;
      } else {
         if ($$0.h() instanceof ctr $$2) {
            dhj var6 = $$2.d();
            if (var6 instanceof cus) {
               return (cus)var6;
            }
         }

         return null;
      }
   }
}
