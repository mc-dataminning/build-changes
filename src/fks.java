public interface fks<T> {
   T f();

   default void b(T $$0) {
   }

   void a(T var1);

   default boolean a(fks<?> $$0) {
      return this.equals($$0);
   }
}
