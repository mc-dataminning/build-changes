public interface fin<T> {
   T f();

   default void b(T $$0) {
   }

   void a(T var1);

   default boolean a(fin<?> $$0) {
      return this.equals($$0);
   }
}
