public interface ajz<T> {
   yn<? super wa, T> codec();

   default ajy<T> a(int $$0) {
      return new ajy<>($$0, this);
   }

   T copy(T var1);

   static <T> ajz<T> a(yn<? super wa, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ajz<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
