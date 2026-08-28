public enum dux {
   a {
      @Override
      public boolean a(eao $$0, din $$1, iv $$2, jb $$3) {
         return dmm.a($$0.h($$1, $$2), $$3);
      }
   },
   b {
      private final ffr d = dmm.b(2.0, 0.0, 10.0);

      @Override
      public boolean a(eao $$0, din $$1, iv $$2, jb $$3) {
         return !ffo.c($$0.h($$1, $$2).a($$3), this.d, ffb.c);
      }
   },
   c {
      private final ffr d = ffo.a(ffo.b(), dmm.b(12.0, 0.0, 16.0), ffb.e);

      @Override
      public boolean a(eao $$0, din $$1, iv $$2, jb $$3) {
         return !ffo.c($$0.h($$1, $$2).a($$3), this.d, ffb.c);
      }
   };

   public abstract boolean a(eao var1, din var2, iv var3, jb var4);
}
