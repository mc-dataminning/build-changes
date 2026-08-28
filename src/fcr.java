public interface fcr {
   fcr a = new fcr() {
      @Override
      public <T> T a(fct<T> $$0) {
         return $$0.e();
      }

      @Override
      public <T> void a(fct<T> $$0, T $$1) {
         $$0.a($$1);
      }
   };

   <T> T a(fct<T> var1);

   <T> void a(fct<T> var1, T var2);
}
