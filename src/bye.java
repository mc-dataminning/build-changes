public abstract class bye<E extends bva> implements bwu<E>, caj<E> {
   private bwt.a a;

   public bye() {
      this.a = bwt.a.a;
   }

   @Override
   public final bwt.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arn $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bwt.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arn $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arn $$0, E $$1, long $$2) {
      this.a = bwt.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
