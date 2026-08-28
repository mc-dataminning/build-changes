public enum drq {
   a {
      @Override
      public boolean a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
         return djk.a($$0.h($$1, $$2), $$3);
      }
   },
   b {
      private final int d = 1;
      private final fbs e = djk.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
         return !fbp.c($$0.h($$1, $$2).a($$3), this.e, fbc.c);
      }
   },
   c {
      private final int d = 2;
      private final fbs e = fbp.a(fbp.b(), djk.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), fbc.e);

      @Override
      public boolean a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
         return !fbp.c($$0.h($$1, $$2).a($$3), this.e, fbc.c);
      }
   };

   public abstract boolean a(dwv var1, dfl var2, ji var3, jn var4);
}
