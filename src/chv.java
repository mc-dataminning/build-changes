public class chv extends chf {
   public chv(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      if ($$0.B) {
         return bgu.a($$3);
      } else {
         if (!$$1.fR().d) {
            $$3.h(1);
         }

         $$1.b(apj.c.b(this));
         $$1.dK().a(null, $$1, aoz.yx, $$1.da(), 1.0F, 1.0F);
         cja $$4 = cjh.a($$0, $$1.do(), $$1.du(), (byte)0, true, false);
         if ($$3.b()) {
            return bgu.b($$4);
         } else {
            if (!$$1.fQ().e($$4.p())) {
               $$1.a($$4, false);
            }

            return bgu.b($$3);
         }
      }
   }
}
