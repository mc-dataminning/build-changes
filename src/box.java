public abstract class box<E extends blv> implements bnn<E>, brc<E> {
   private bnm.a a;

   public box() {
      this.a = bnm.a.a;
   }

   @Override
   public final bnm.a a() {
      return this.a;
   }

   @Override
   public final boolean e(amp $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bnm.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(amp $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(amp $$0, E $$1, long $$2) {
      this.a = bnm.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
