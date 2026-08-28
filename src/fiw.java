public interface fiw<T> {
   fiw<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fiw<T> a() {
      return (fiw<T>)a;
   }

   T get();
}
