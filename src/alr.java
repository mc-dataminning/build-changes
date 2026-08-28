@FunctionalInterface
public interface alr<T, V> {
   V get(aly<T> var1);

   static <T, V> alr<T, V> fixed(V $$0) {
      return $$1 -> $$0;
   }
}
