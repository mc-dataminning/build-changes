public interface akh<T> {
   yt<? super wg, T> codec();

   default akg<T> a(int $$0) {
      return new akg<>($$0, this);
   }

   T copy(T var1);

   static <T> akh<T> a(yt<? super wg, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends akh<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
