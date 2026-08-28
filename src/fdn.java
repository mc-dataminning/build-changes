public interface fdn<T> {
   fdn<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fdn<T> a() {
      return (fdn<T>)a;
   }

   T get();
}
