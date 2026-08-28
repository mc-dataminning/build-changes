public interface fed<T> {
   fed<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fed<T> a() {
      return (fed<T>)a;
   }

   T get();
}
