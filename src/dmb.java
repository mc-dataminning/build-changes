public enum dmb {
   a {
      @Override
      public boolean a(drd $$0, daf $$1, io $$2, it $$3) {
         return dea.a($$0.l($$1, $$2), $$3);
      }
   },
   b {
      private final int d = 1;
      private final evf e = dea.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean a(drd $$0, daf $$1, io $$2, it $$3) {
         return !evc.c($$0.l($$1, $$2).a($$3), this.e, euq.c);
      }
   },
   c {
      private final int d = 2;
      private final evf e = evc.a(evc.b(), dea.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), euq.e);

      @Override
      public boolean a(drd $$0, daf $$1, io $$2, it $$3) {
         return !evc.c($$0.l($$1, $$2).a($$3), this.e, euq.c);
      }
   };

   public abstract boolean a(drd var1, daf var2, io var3, it var4);
}
