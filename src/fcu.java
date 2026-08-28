public interface fcu<T> {
   fcu<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fcu<T> a() {
      return (fcu<T>)a;
   }

   T get();
}
