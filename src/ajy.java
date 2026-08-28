public interface ajy<T> {
   yn<? super wa, T> codec();

   default ajx<T> a(int $$0) {
      return new ajx<>($$0, this);
   }

   T copy(T var1);

   static <T> ajy<T> a(yn<? super wa, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ajy<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
