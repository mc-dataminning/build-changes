public class csx extends csk {
   public csx(ctv.a $$0) {
      super($$0);
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      if ($$0.B) {
         return bqe.a($$3);
      } else {
         $$3.a(1, $$1);
         $$1.b(avp.c.b(this));
         $$1.dP().a(null, $$1, avf.Au, $$1.de(), 1.0F, 1.0F);
         cua $$4 = cui.a($$0, $$1.dt(), $$1.dz(), (byte)0, true, false);
         if ($$3.e()) {
            return bqe.b($$4);
         } else {
            if (!$$1.fY().f($$4.s())) {
               $$1.a($$4, false);
            }

            return bqe.b($$3);
         }
      }
   }
}
