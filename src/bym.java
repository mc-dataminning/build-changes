public abstract class bym<E extends bvi> implements bxc<E>, car<E> {
   private bxb.a a;

   public bym() {
      this.a = bxb.a.a;
   }

   @Override
   public final bxb.a a() {
      return this.a;
   }

   @Override
   public final boolean e(ard $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bxb.a.b;
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
      this.a = bxb.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
