public interface akm<T> {
   zg<? super wt, T> codec();

   default akl<T> a(int $$0) {
      return new akl<>($$0, this);
   }

   T copy(T var1);

   static <T> akm<T> a(zg<? super wt, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends akm<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
