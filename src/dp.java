public interface dp {
   <T> id<T> a(afv<? extends io<T>> var1);

   static dp a(final id.b $$0, final cfg $$1) {
      return new dp() {
         @Override
         public <T> id<T> a(afv<? extends io<T>> $$0x) {
            return $$0.b($$0).a($$1);
         }
      };
   }

   static dp.a a(final ip $$0, final cfg $$1) {
      return new dp.a() {
         dp.b c = dp.b.b;

         @Override
         public void a(dp.b $$0x) {
            this.c = $$0;
         }

         @Override
         public <T> id<T> a(afv<? extends io<T>> $$0x) {
            io<T> $$1 = $$0.d($$0);
            final id.c<T> $$2 = $$1.p();
            final id.c<T> $$3 = $$1.u();
            id.c<T> $$4 = new id.c.a<T>() {
               @Override
               protected id.c<T> a() {
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
