public interface ain<T> {
   xs<? super vf, T> codec();

   default aim<T> a(int $$0) {
      return new aim<>($$0, this);
   }

   T copy(T var1);

   static <T> ain<T> a(xs<? super vf, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ain<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
