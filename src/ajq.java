public interface ajq<T> {
   ys<? super wf, T> codec();

   default ajp<T> a(int $$0) {
      return new ajp<>($$0, this);
   }

   T copy(T var1);

   static <T> ajq<T> a(ys<? super wf, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ajq<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
