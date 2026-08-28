@FunctionalInterface
public interface alj<T, V> {
   V get(alq<T> var1);

   static <T, V> alj<T, V> fixed(V $$0) {
      return $$1 -> $$0;
   }
}
