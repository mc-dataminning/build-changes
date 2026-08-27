public abstract class bph<E extends bmf> implements bnx<E>, brm<E> {
   private bnw.a a;

   public bph() {
      this.a = bnw.a.a;
   }

   @Override
   public final bnw.a a() {
      return this.a;
   }

   @Override
   public final boolean e(amz $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bnw.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(amz $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(amz $$0, E $$1, long $$2) {
      this.a = bnw.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
