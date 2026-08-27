public interface dm {
   <T> hg<T> a(acp<? extends hr<T>> var1);

   static dm a(final hg.b $$0, final caw $$1) {
      return new dm() {
         @Override
         public <T> hg<T> a(acp<? extends hr<T>> $$0x) {
            return $$0.b($$0).a($$1);
         }
      };
   }

   static dm.a a(final hs $$0, final caw $$1) {
      return new dm.a() {
         dm.b c = dm.b.b;

         @Override
         public void a(dm.b $$0x) {
            this.c = $$0;
         }

         @Override
         public <T> hg<T> a(acp<? extends hr<T>> $$0x) {
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

   public interface a extends dm {
      void a(dm.b var1);
   }

   public static enum b {
      a,
      b;
   }
}
