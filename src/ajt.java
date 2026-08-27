public interface ajt<T> {
   yv<? super wi, T> codec();

   default ajs<T> a(int $$0) {
      return new ajs<>($$0, this);
   }

   T copy(T var1);

   static <T> ajt<T> a(yv<? super wi, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ajt<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
