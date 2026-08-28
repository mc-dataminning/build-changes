public interface fil {
   fil a = new fil() {
      @Override
      public <T> T a(fin<T> $$0) {
         T $$1 = $$0.f();
         $$0.b($$1);
         return $$1;
      }

      @Override
      public <T> void a(fin<T> $$0, T $$1) {
         $$0.a($$1);
      }
   };

   <T> T a(fin<T> var1);

   <T> void a(fin<T> var1, T var2);
}
