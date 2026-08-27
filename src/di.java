public interface di<T> extends cj {
   @Override
   default boolean a(cuh $$0) {
      T $$1 = $$0.a(this.a());
      return $$1 != null && this.a($$0, $$1);
   }

   kd<T> a();

   boolean a(cuh var1, T var2);
}
