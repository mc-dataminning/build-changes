public interface fdf<T> {
   fdf<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fdf<T> a() {
      return (fdf<T>)a;
   }

   T get();
}
