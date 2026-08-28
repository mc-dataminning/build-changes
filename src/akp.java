public interface akp<T> {
   zj<? super ww, T> codec();

   default ako<T> a(int $$0) {
      return new ako<>($$0, this);
   }

   T copy(T var1);

   static <T> akp<T> a(zj<? super ww, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends akp<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
