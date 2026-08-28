public class ctp extends ctv {
   private static final int a = 40;

   public ctp(ctv.a $$0) {
      super($$0);
   }

   @Override
   public cua a(cua $$0, dcd $$1, bsy $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof aql $$3) {
         am.A.a($$3, $$0);
         $$3.b(avp.c.b(this));
      }

      if (!$$1.B) {
         $$2.e(brn.s);
      }

      if ($$0.e()) {
         return new cua(cud.sl);
      } else {
         if ($$2 instanceof cmh $$4 && !$$4.fL()) {
            cua $$5 = new cua(cud.sl);
            if (!$$4.fY().f($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int a(cua $$0, bsy $$1) {
      return 40;
   }

   @Override
   public cvv b(cua $$0) {
      return cvv.c;
   }

   @Override
   public ave al_() {
      return avf.mD;
   }

   @Override
   public ave am_() {
      return avf.mD;
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      return cuc.a($$0, $$1, $$2);
   }
}
