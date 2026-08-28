@FunctionalInterface
public interface akz<T, V> {
   V get(alg<T> var1);

   static <T, V> akz<T, V> fixed(V $$0) {
      return $$1 -> $$0;
   }
}
