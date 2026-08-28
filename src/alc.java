@FunctionalInterface
public interface alc<T, V> {
   V get(alj<T> var1);

   static <T, V> alc<T, V> fixed(V $$0) {
      return $$1 -> $$0;
   }
}
