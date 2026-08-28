@FunctionalInterface
public interface akn<T, V> {
   V get(aku<T> var1);

   static <T, V> akn<T, V> fixed(V $$0) {
      return $$1 -> $$0;
   }
}
