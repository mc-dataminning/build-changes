public abstract class bwc<E extends bsy> implements bus<E>, byh<E> {
   private bur.a a;

   public bwc() {
      this.a = bur.a.a;
   }

   @Override
   public final bur.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aqk $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bur.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqk $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aqk $$0, E $$1, long $$2) {
      this.a = bur.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
