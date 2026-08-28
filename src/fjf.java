public interface fjf<T> {
   T f();

   default void b(T $$0) {
   }

   void a(T var1);

   default boolean a(fjf<?> $$0) {
      return this.equals($$0);
   }
}
