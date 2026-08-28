class btz extends bue {
   protected btz(buf $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public boolean a(arx $$0, bvx $$1, int $$2) {
      if ($$1 instanceof ary $$3 && !$$3.aa_() && $$0.am() != bsx.a && $$0.c($$3.dw())) {
         crb $$4 = $$0.d($$3.dw());
         if ($$4 == null || $$4.m() < $$4.l()) {
            $$3.a(new bug(bui.I, 600, $$2));
            $$3.c($$3.dw());
            return false;
         }
      }

      return true;
   }
}
