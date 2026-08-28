public abstract class cay<E extends bxw> implements bzo<E>, cdd<E> {
   private bzn.a a;

   public cay() {
      this.a = bzn.a.a;
   }

   @Override
   public final bzn.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aru $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bzn.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aru $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aru $$0, E $$1, long $$2) {
      this.a = bzn.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
