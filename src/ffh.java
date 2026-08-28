public interface ffh<T> {
   ffh<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> ffh<T> a() {
      return (ffh<T>)a;
   }

   T get();
}
