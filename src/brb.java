class brb extends brf {
   protected brb(brg $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(bso $$0, int $$1) {
      if ($$0 instanceof aqu $$2 && !$$0.O_()) {
         aqt $$3 = $$2.B();
         if ($$3.al() != bpx.a && $$3.c($$0.du())) {
            $$3.z().a($$2);
         }
      }

      return true;
   }
}
