public interface aki<T> {
   yu<? super wh, T> codec();

   default akh<T> a(int $$0) {
      return new akh<>($$0, this);
   }

   T copy(T var1);

   static <T> aki<T> a(yu<? super wh, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends aki<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
