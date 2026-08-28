public abstract class aaa<T extends xb> implements aac<T> {
   private final Iterable<aac<? super T>> a;

   protected aaa(Iterable<aac<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<aac<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract aae<? extends aaa<T>> a();
}
