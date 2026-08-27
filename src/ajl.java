public interface ajl<T> {
   yq<? super wd, T> codec();

   default ajk<T> a(int $$0) {
      return new ajk<>($$0, this);
   }

   T copy(T var1);

   static <T> ajl<T> a(yq<? super wd, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends ajl<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
