public interface fgd<T> {
   fgd<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fgd<T> a() {
      return (fgd<T>)a;
   }

   T get();
}
