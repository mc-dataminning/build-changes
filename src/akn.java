public interface akn<T> {
   zh<? super wu, T> codec();

   default akm<T> a(int $$0) {
      return new akm<>($$0, this);
   }

   T copy(T var1);

   static <T> akn<T> a(zh<? super wu, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends akn<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
