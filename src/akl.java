public interface akl<T> {
   zf<? super ws, T> codec();

   default akk<T> a(int $$0) {
      return new akk<>($$0, this);
   }

   T copy(T var1);

   static <T> akl<T> a(zf<? super ws, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends akl<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
