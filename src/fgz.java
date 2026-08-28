public interface fgz<T> {
   T f();

   default void b(T $$0) {
   }

   void a(T var1);

   default boolean a(fgz<?> $$0) {
      return this.equals($$0);
   }
}
