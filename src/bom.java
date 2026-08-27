public abstract class bom<E extends bll> implements bnd<E>, bqr<E> {
   private bnc.a a;

   public bom() {
      this.a = bnc.a.a;
   }

   @Override
   public final bnc.a a() {
      return this.a;
   }

   @Override
   public final boolean e(ami $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bnc.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ami $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(ami $$0, E $$1, long $$2) {
      this.a = bnc.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
