public class cqp extends cqc {
   public cqp(crn.a $$0) {
      super($$0);
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      if ($$0.B) {
         return bog.a($$3);
      } else {
         $$3.a(1, $$1);
         $$1.b(auz.c.b(this));
         $$1.dM().a(null, $$1, auo.zY, $$1.db(), 1.0F, 1.0F);
         crs $$4 = crz.a($$0, $$1.dq(), $$1.dw(), (byte)0, true, false);
         if ($$3.d()) {
            return bog.b($$4);
         } else {
            if (!$$1.fZ().e($$4.r())) {
               $$1.a($$4, false);
            }

            return bog.b($$3);
         }
      }
   }
}
