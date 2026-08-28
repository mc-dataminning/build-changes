public interface akv<T> {
   ze<? super wp, T> codec();

   default aku<T> a(int $$0) {
      return new aku<>($$0, this);
   }

   T copy(T var1);

   static <T> akv<T> a(ze<? super wp, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends akv<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
