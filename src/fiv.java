public interface fiv<T> {
   T f();

   default void b(T $$0) {
   }

   void a(T var1);

   default boolean a(fiv<?> $$0) {
      return this.equals($$0);
   }
}
