public interface fji {
   fji a = new fji() {
      @Override
      public <T> T a(fjk<T> $$0) {
         T $$1 = $$0.f();
         $$0.b($$1);
         return $$1;
      }

      @Override
      public <T> void a(fjk<T> $$0, T $$1) {
         $$0.a($$1);
      }
   };

   <T> T a(fjk<T> var1);

   <T> void a(fjk<T> var1, T var2);
}
