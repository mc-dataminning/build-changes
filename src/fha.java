public interface fha<T> {
   fha<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fha<T> a() {
      return (fha<T>)a;
   }

   T get();
}
