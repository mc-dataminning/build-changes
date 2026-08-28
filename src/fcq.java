public interface fcq<T> {
   fcq<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fcq<T> a() {
      return (fcq<T>)a;
   }

   T get();
}
