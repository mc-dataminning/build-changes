public interface fkr<T> {
   fkr<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fkr<T> a() {
      return (fkr<T>)a;
   }

   T get();
}
