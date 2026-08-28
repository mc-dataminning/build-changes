public interface ako<T> {
   za<? super wn, T> codec();

   default akn<T> a(int $$0) {
      return new akn<>($$0, this);
   }

   T copy(T var1);

   static <T> ako<T> a(za<? super wn, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ako<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
