class bjx extends bkb {
   protected bjx(bkc $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public void a(blg $$0, int $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof amf $$2 && !$$0.O_()) {
         ame $$3 = $$2.z();
         if ($$3.aj() == biu.a) {
            return;
         }

         if ($$3.b($$0.dn())) {
            $$3.y().a($$2);
         }
      }
   }
}
