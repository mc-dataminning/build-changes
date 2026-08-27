public interface dp {
   <T> ii<T> a(agl<? extends is<T>> var1);

   static dp a(final ii.b $$0, final cgi $$1) {
      return new dp() {
         @Override
         public <T> ii<T> a(agl<? extends is<T>> $$0x) {
            return $$0.b($$0).a($$1);
         }
      };
   }

   static dp.a a(final it $$0, final cgi $$1) {
      return new dp.a() {
         dp.b c = dp.b.b;

         @Override
         public void a(dp.b $$0x) {
            this.c = $$0;
         }

         @Override
         public <T> ii<T> a(agl<? extends is<T>> $$0x) {
            is<T> $$1 = $$0.d($$0);
            final ii.c<T> $$2 = $$1.p();
            final ii.c<T> $$3 = $$1.u();
            ii.c<T> $$4 = new ii.c.a<T>() {
               @Override
               protected ii.c<T> a() {
                  return switch (c) {
                     case b -> $$2;
                     case a -> $$3;
                  };
               }
            };
            return $$4.a($$1);
         }
      };
   }

   public interface a extends dp {
      void a(dp.b var1);
   }

   public static enum b {
      a,
      b;
   }
}
