public interface fio<T> {
   fio<?> a = () -> {
      throw new IllegalStateException("Cannot dereference handle with no underlying resource");
   };

   static <T> fio<T> a() {
      return (fio<T>)a;
   }

   T get();
}
