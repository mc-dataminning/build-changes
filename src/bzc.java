public abstract class bzc<E extends bvy> implements bxs<E>, cbh<E> {
   private bxr.a a;

   public bzc() {
      this.a = bxr.a.a;
   }

   @Override
   public final bxr.a a() {
      return this.a;
   }

   @Override
   public final boolean e(ard $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bxr.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ard $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(ard $$0, E $$1, long $$2) {
      this.a = bxr.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
