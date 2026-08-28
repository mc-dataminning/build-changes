public enum drr {
   a {
      @Override
      public boolean a(dww $$0, dfm $$1, ji $$2, jn $$3) {
         return djl.a($$0.h($$1, $$2), $$3);
      }
   },
   b {
      private final int d = 1;
      private final fbt e = djl.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean a(dww $$0, dfm $$1, ji $$2, jn $$3) {
         return !fbq.c($$0.h($$1, $$2).a($$3), this.e, fbd.c);
      }
   },
   c {
      private final int d = 2;
      private final fbt e = fbq.a(fbq.b(), djl.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), fbd.e);

      @Override
      public boolean a(dww $$0, dfm $$1, ji $$2, jn $$3) {
         return !fbq.c($$0.h($$1, $$2).a($$3), this.e, fbd.c);
      }
   };

   public abstract boolean a(dww var1, dfm var2, ji var3, jn var4);
}
