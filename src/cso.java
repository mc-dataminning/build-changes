public class cso extends csu {
   private static final int a = 40;

   public cso(csu.a $$0) {
      super($$0);
   }

   @Override
   public csz a(csz $$0, dad $$1, bsa $$2) {
      super.a($$0, $$1, $$2);
      if ($$2 instanceof aqi $$3) {
         am.A.a($$3, $$0);
         $$3.b(avm.c.b(this));
      }

      if (!$$1.B) {
         $$2.e(bqv.s);
      }

      if ($$0.d()) {
         return new csz(ctc.sl);
      } else {
         if ($$2 instanceof clh $$4 && !$$4.fN()) {
            csz $$5 = new csz(ctc.sl);
            if (!$$4.ga().f($$5)) {
               $$4.a($$5, false);
            }
         }

         return $$0;
      }
   }

   @Override
   public int b(csz $$0) {
      return 40;
   }

   @Override
   public cus c(csz $$0) {
      return cus.c;
   }

   @Override
   public avb ak_() {
      return avc.mt;
   }

   @Override
   public avb al_() {
      return avc.mt;
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      return ctb.a($$0, $$1, $$2);
   }
}
