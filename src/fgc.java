public interface fgc<T> {
   fgc<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fgc<T> a() {
      return (fgc<T>)a;
   }

   T get();
}
