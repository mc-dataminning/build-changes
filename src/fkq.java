public interface fkq<T> {
   T f();

   default void b(T $$0) {
   }

   void a(T var1);

   default boolean a(fkq<?> $$0) {
      return this.equals($$0);
   }
}
