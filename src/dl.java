public interface dl {
   <T> hg<T> a(aeq<? extends hr<T>> var1);

   static dl a(final hg.b $$0, final cdv $$1) {
      return new dl() {
         @Override
         public <T> hg<T> a(aeq<? extends hr<T>> $$0x) {
            return $$0.b($$0).a($$1);
         }
      };
   }

   static dl.a a(final hs $$0, final cdv $$1) {
      return new dl.a() {
         dl.b c = dl.b.b;

         @Override
         public void a(dl.b $$0x) {
            this.c = $$0;
         }

         @Override
         public <T> hg<T> a(aeq<? extends hr<T>> $$0x) {
            hr<T> $$1 = $$0.d($$0);
            final hg.c<T> $$2 = $$1.p();
            final hg.c<T> $$3 = $$1.u();
            hg.c<T> $$4 = new hg.c.a<T>() {
               @Override
               protected hg.c<T> a() {
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

   public interface a extends dl {
      void a(dl.b var1);
   }

   public static enum b {
      a,
      b;
   }
}
