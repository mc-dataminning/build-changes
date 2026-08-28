public enum drt {
   a {
      @Override
      public boolean a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
         return djn.a($$0.h($$1, $$2), $$3);
      }
   },
   b {
      private final int d = 1;
      private final fbv e = djn.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
         return !fbs.c($$0.h($$1, $$2).a($$3), this.e, fbf.c);
      }
   },
   c {
      private final int d = 2;
      private final fbv e = fbs.a(fbs.b(), djn.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), fbf.e);

      @Override
      public boolean a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
         return !fbs.c($$0.h($$1, $$2).a($$3), this.e, fbf.c);
      }
   };

   public abstract boolean a(dwy var1, dfo var2, ji var3, jn var4);
}
