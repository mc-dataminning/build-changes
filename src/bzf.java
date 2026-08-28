public abstract class bzf<E extends bwb> implements bxv<E>, cbk<E> {
   private bxu.a a;

   public bzf() {
      this.a = bxu.a.a;
   }

   @Override
   public final bxu.a a() {
      return this.a;
   }

   @Override
   public final boolean e(ash $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bxu.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ash $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(ash $$0, E $$1, long $$2) {
      this.a = bxu.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
