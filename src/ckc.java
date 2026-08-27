import javax.annotation.Nullable;

public interface ckc extends cmv {
   bkn g();

   default aqm ar_() {
      return aqn.af;
   }

   default bir<clb> a(ckw $$0, crs $$1, cdm $$2, bip $$3) {
      clb $$4 = $$2.b($$3);
      bkn $$5 = bla.h($$4);
      clb $$6 = $$2.c($$5);
      if ((!cpo.d($$6) || $$2.f()) && !clb.a($$4, $$6)) {
         if (!$$1.x_()) {
            $$2.b(aqx.c.b($$0));
         }

         clb $$7 = $$6.b() ? $$4 : $$6.c();
         clb $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bir.a($$7, $$1.x_());
      } else {
         return bir.d($$4);
      }
   }

   @Nullable
   static ckc c_(clb $$0) {
      ckw $$3 = $$0.d();
      if ($$3 instanceof ckc) {
         return (ckc)$$3;
      } else {
         if ($$0.d() instanceof ciu $$2) {
            cut var6 = $$2.e();
            if (var6 instanceof ckc) {
               return (ckc)var6;
            }
         }

         return null;
      }
   }
}
