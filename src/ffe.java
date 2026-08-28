public interface ffe<T> {
   ffe<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> ffe<T> a() {
      return (ffe<T>)a;
   }

   T get();
}
