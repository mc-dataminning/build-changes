public abstract class cab<E extends bwz> implements byr<E>, ccg<E> {
   private byq.a a;

   public cab() {
      this.a = byq.a.a;
   }

   @Override
   public final byq.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aro $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = byq.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aro $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aro $$0, E $$1, long $$2) {
      this.a = byq.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
