public class cbz extends caw {
   public cbz(bkz<? extends cbz> $$0, csf $$1) {
      super($$0, $$1);
   }

   public static boolean a(bkz<cbz> $$0, csu $$1, blp $$2, hx $$3, atw $$4) {
      hx $$5 = $$3;

      do {
         $$5 = $$5.c();
      } while ($$1.a_($$5).a(cvh.qP));

      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == blp.c || $$1.g($$5.d()));
   }

   @Override
   protected aqu y() {
      return aqv.xU;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.xW;
   }

   @Override
   protected aqu n_() {
      return aqv.xV;
   }

   @Override
   aqu w() {
      return aqv.xX;
   }

   @Override
   protected cef b(clo $$0, float $$1) {
      cef $$2 = super.b($$0, $$1);
      if ($$2 instanceof ceh) {
         ((ceh)$$2).a(new bki(bkk.b, 600));
      }

      return $$2;
   }
}
