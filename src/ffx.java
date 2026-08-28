public interface ffx<T> {
   ffx<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> ffx<T> a() {
      return (ffx<T>)a;
   }

   T get();
}
