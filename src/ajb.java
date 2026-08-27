public interface ajb<T> {
   yg<? super vt, T> codec();

   default aja<T> a(int $$0) {
      return new aja<>($$0, this);
   }

   T copy(T var1);

   static <T> ajb<T> a(yg<? super vt, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ajb<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
