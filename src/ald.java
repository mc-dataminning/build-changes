public interface ald<T> {
   zt<? super xg, T> codec();

   default alc<T> a(int $$0) {
      return new alc<>($$0, this);
   }

   T copy(T var1);

   static <T> ald<T> a(zt<? super xg, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ald<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
