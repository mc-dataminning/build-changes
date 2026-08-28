public interface fic<T> {
   fic<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fic<T> a() {
      return (fic<T>)a;
   }

   T get();
}
