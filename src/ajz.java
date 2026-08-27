public interface ajz<T> {
   zc<? super wp, T> codec();

   default ajy<T> a(int $$0) {
      return new ajy<>($$0, this);
   }

   T copy(T var1);

   static <T> ajz<T> a(zc<? super wp, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ajz<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
