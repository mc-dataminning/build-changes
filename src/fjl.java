public interface fjl<T> {
   fjl<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fjl<T> a() {
      return (fjl<T>)a;
   }

   T get();
}
