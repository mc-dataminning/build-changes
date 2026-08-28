public interface fko {
   fko a = new fko() {
      @Override
      public <T> T a(fkq<T> $$0) {
         T $$1 = $$0.f();
         $$0.b($$1);
         return $$1;
      }

      @Override
      public <T> void a(fkq<T> $$0, T $$1) {
         $$0.a($$1);
      }
   };

   <T> T a(fkq<T> var1);

   <T> void a(fkq<T> var1, T var2);
}
