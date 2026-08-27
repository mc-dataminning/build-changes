public class cud extends cpn {
   private static final int a = 20;

   public cud(dca.d $$0) {
      super($$0);
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfj $$3) {
      if (!$$3.bQ() && $$3 instanceof bfz && !cki.j((bfz)$$3)) {
         $$3.a($$0.ag().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      cps.b($$1, $$2.c(), $$0);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$1 == ha.b && $$2.a(cpo.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
