public enum dsq {
   a {
      @Override
      public boolean a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
         return dkm.a($$0.h($$1, $$2), $$3);
      }
   },
   b {
      private final int d = 1;
      private final fcs e = dkm.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
         return !fcp.c($$0.h($$1, $$2).a($$3), this.e, fcc.c);
      }
   },
   c {
      private final int d = 2;
      private final fcs e = fcp.a(fcp.b(), dkm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), fcc.e);

      @Override
      public boolean a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
         return !fcp.c($$0.h($$1, $$2).a($$3), this.e, fcc.c);
      }
   };

   public abstract boolean a(dxv var1, dgn var2, jh var3, jm var4);
}
