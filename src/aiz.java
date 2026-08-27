public interface aiz<T> {
   ye<? super vr, T> codec();

   default aiy<T> a(int $$0) {
      return new aiy<>($$0, this);
   }

   T copy(T var1);

   static <T> aiz<T> a(ye<? super vr, T> $$0) {
      return () -> $$0;
   }

   public interface a<T> extends aiz<T> {
      @Override
      default T copy(T $$0) {
         return $$0;
      }
   }
}
