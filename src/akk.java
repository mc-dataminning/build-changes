public interface akk<T> {
   zm<? super wz, T> codec();

   default akj<T> a(int $$0) {
      return new akj<>($$0, this);
   }

   T copy(T var1);

   static <T> akk<T> a(zm<? super wz, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends akk<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
