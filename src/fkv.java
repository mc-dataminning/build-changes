public interface fkv<T> {
   fkv<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fkv<T> a() {
      return (fkv<T>)a;
   }

   T get();
}
