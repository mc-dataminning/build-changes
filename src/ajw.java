public interface ajw<T> {
   yw<? super wj, T> codec();

   default ajv<T> a(int $$0) {
      return new ajv<>($$0, this);
   }

   T copy(T var1);

   static <T> ajw<T> a(yw<? super wj, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ajw<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
