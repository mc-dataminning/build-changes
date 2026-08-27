public class cmc extends clm {
   public cmc(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      if ($$0.B) {
         return bkd.a($$3);
      } else {
         if (!$$1.fT().d) {
            $$3.h(1);
         }

         $$1.b(asd.c.b(this));
         $$1.dL().a(null, $$1, art.zM, $$1.db(), 1.0F, 1.0F);
         cng $$4 = cnn.a($$0, $$1.dp(), $$1.dv(), (byte)0, true, false);
         if ($$3.b()) {
            return bkd.b($$4);
         } else {
            if (!$$1.fS().e($$4.p())) {
               $$1.a($$4, false);
            }

            return bkd.b($$3);
         }
      }
   }
}
