public interface fcb<T> {
   fcb<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fcb<T> a() {
      return (fcb<T>)a;
   }

   T get();
}
