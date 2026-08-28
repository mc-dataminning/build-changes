@FunctionalInterface
public interface alb<T, V> {
   V get(ali<T> var1);

   static <T, V> alb<T, V> fixed(V $$0) {
      return $$1 -> $$0;
   }
}
