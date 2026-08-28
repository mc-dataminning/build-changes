@FunctionalInterface
public interface akv<T, V> {
   V get(alc<T> var1);

   static <T, V> akv<T, V> fixed(V $$0) {
      return $$1 -> $$0;
   }
}
