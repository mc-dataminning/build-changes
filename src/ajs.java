public interface ajs<T> {
   yv<? super wi, T> codec();

   default ajr<T> a(int $$0) {
      return new ajr<>($$0, this);
   }

   T copy(T var1);

   static <T> ajs<T> a(yv<? super wi, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ajs<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
