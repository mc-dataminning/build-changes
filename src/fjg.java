public interface fjg<T> {
   fjg<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fjg<T> a() {
      return (fjg<T>)a;
   }

   T get();
}
