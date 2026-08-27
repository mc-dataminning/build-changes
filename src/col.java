public class col extends cnx {
   public col(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      if ($$0.B) {
         return bmm.a($$3);
      } else {
         if (!$$1.fW().d) {
            $$3.h(1);
         }

         $$1.b(atz.c.b(this));
         $$1.dJ().a(null, $$1, atp.zN, $$1.cY(), 1.0F, 1.0F);
         cpq $$4 = cpx.a($$0, $$1.dn(), $$1.dt(), (byte)0, true, false);
         if ($$3.b()) {
            return bmm.b($$4);
         } else {
            if (!$$1.fV().e($$4.q())) {
               $$1.a($$4, false);
            }

            return bmm.b($$3);
         }
      }
   }
}
