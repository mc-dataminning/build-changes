public interface ajx<T> {
   yx<? super wk, T> codec();

   default ajw<T> a(int $$0) {
      return new ajw<>($$0, this);
   }

   T copy(T var1);

   static <T> ajx<T> a(yx<? super wk, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ajx<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
