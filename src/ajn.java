public interface ajn<T> {
   ys<? super wf, T> codec();

   default ajm<T> a(int $$0) {
      return new ajm<>($$0, this);
   }

   T copy(T var1);

   static <T> ajn<T> a(ys<? super wf, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ajn<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
