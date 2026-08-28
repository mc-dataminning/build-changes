public enum duj {
   a {
      @Override
      public boolean a(dzz $$0, dib $$1, iu $$2, ja $$3) {
         return dma.a($$0.h($$1, $$2), $$3);
      }
   },
   b {
      private final ffc d = dma.b(2.0, 0.0, 10.0);

      @Override
      public boolean a(dzz $$0, dib $$1, iu $$2, ja $$3) {
         return !fez.c($$0.h($$1, $$2).a($$3), this.d, fem.c);
      }
   },
   c {
      private final ffc d = fez.a(fez.b(), dma.b(12.0, 0.0, 16.0), fem.e);

      @Override
      public boolean a(dzz $$0, dib $$1, iu $$2, ja $$3) {
         return !fez.c($$0.h($$1, $$2).a($$3), this.d, fem.c);
      }
   };

   public abstract boolean a(dzz var1, dib var2, iu var3, ja var4);
}
