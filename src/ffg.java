public interface ffg<T> {
   ffg<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> ffg<T> a() {
      return (ffg<T>)a;
   }

   T get();
}
