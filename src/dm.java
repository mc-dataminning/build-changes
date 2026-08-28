public interface dm<T> extends ku {
   @Override
   default boolean a(kg $$0) {
      T $$1 = $$0.a(this.a());
      return $$1 != null && this.a($$1);
   }

   kk<T> a();

   boolean a(T var1);
}
