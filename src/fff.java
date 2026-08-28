public interface fff<T> {
   fff<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fff<T> a() {
      return (fff<T>)a;
   }

   T get();
}
