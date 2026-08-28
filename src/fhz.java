public interface fhz {
   fhz a = new fhz() {
      @Override
      public <T> T a(fib<T> $$0) {
         T $$1 = $$0.f();
         $$0.b($$1);
         return $$1;
      }

      @Override
      public <T> void a(fib<T> $$0, T $$1) {
         $$0.a($$1);
      }
   };

   <T> T a(fib<T> var1);

   <T> void a(fib<T> var1, T var2);
}
