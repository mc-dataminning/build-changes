public interface aij<T> {
   xq<? super vd, T> codec();

   default aii<T> a(int $$0) {
      return new aii<>($$0, this);
   }

   T copy(T var1);

   static <T> aij<T> a(xq<? super vd, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends aij<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
