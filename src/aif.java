public interface aif<T> {
   xo<? super vb, T> codec();

   default aie<T> a(int $$0) {
      return new aie<>($$0, this);
   }

   T copy(T var1);

   static <T> aif<T> a(xo<? super vb, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends aif<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
