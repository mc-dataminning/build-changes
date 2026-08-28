public interface fga {
   fga a = new fga() {
      @Override
      public <T> T a(fgc<T> $$0) {
         T $$1 = $$0.f();
         $$0.b($$1);
         return $$1;
      }

      @Override
      public <T> void a(fgc<T> $$0, T $$1) {
         $$0.a($$1);
      }
   };

   <T> T a(fgc<T> var1);

   <T> void a(fgc<T> var1, T var2);
}
