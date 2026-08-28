public interface dl<T> extends kt {
   @Override
   default boolean a(kf $$0) {
      T $$1 = $$0.a(this.a());
      return $$1 != null && this.a($$1);
   }

   kj<T> a();

   boolean a(T var1);
}
