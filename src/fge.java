public interface fge<T> {
   fge<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fge<T> a() {
      return (fge<T>)a;
   }

   T get();
}
