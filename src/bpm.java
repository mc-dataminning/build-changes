public abstract class bpm<E extends bmk> implements boc<E>, brr<E> {
   private bob.a a;

   public bpm() {
      this.a = bob.a.a;
   }

   @Override
   public final bob.a a() {
      return this.a;
   }

   @Override
   public final boolean e(and $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bob.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(and $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(and $$0, E $$1, long $$2) {
      this.a = bob.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
