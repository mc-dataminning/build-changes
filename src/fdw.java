public interface fdw<T> {
   fdw<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fdw<T> a() {
      return (fdw<T>)a;
   }

   T get();
}
