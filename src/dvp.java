public enum dvp {
   a {
      @Override
      public boolean a(ebg $$0, djd $$1, iw $$2, jc $$3) {
         return dne.a($$0.h($$1, $$2), $$3);
      }
   },
   b {
      private final fgm d = dne.b(2.0, 0.0, 10.0);

      @Override
      public boolean a(ebg $$0, djd $$1, iw $$2, jc $$3) {
         return !fgj.c($$0.h($$1, $$2).a($$3), this.d, ffw.c);
      }
   },
   c {
      private final fgm d = fgj.a(fgj.b(), dne.b(12.0, 0.0, 16.0), ffw.e);

      @Override
      public boolean a(ebg $$0, djd $$1, iw $$2, jc $$3) {
         return !fgj.c($$0.h($$1, $$2).a($$3), this.d, ffw.c);
      }
   };

   public abstract boolean a(ebg var1, djd var2, iw var3, jc var4);
}
