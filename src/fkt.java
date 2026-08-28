public interface fkt<T> {
   fkt<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fkt<T> a() {
      return (fkt<T>)a;
   }

   T get();
}
