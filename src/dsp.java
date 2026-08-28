public enum dsp {
   a {
      @Override
      public boolean a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
         return dkl.a($$0.h($$1, $$2), $$3);
      }
   },
   b {
      private final int d = 1;
      private final fcr e = dkl.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
         return !fco.c($$0.h($$1, $$2).a($$3), this.e, fcb.c);
      }
   },
   c {
      private final int d = 2;
      private final fcr e = fco.a(fco.b(), dkl.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), fcb.e);

      @Override
      public boolean a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
         return !fco.c($$0.h($$1, $$2).a($$3), this.e, fcb.c);
      }
   };

   public abstract boolean a(dxu var1, dgm var2, jh var3, jm var4);
}
