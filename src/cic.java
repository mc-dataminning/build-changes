public class cic extends chm {
   public cic(cjc.a $$0) {
      super($$0);
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      if ($$0.B) {
         return bhb.a($$3);
      } else {
         if (!$$1.fS().d) {
            $$3.h(1);
         }

         $$1.b(app.c.b(this));
         $$1.dL().a(null, $$1, apf.yx, $$1.da(), 1.0F, 1.0F);
         cjh $$4 = cjo.a($$0, $$1.dp(), $$1.dv(), (byte)0, true, false);
         if ($$3.b()) {
            return bhb.b($$4);
         } else {
            if (!$$1.fR().e($$4.p())) {
               $$1.a($$4, false);
            }

            return bhb.b($$3);
         }
      }
   }
}
