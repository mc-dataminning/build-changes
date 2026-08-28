@FunctionalInterface
public interface akm<T, V> {
   V get(akt<T> var1);

   static <T, V> akm<T, V> fixed(V $$0) {
      return $$1 -> $$0;
   }
}
