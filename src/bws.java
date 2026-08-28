public abstract class bws<E extends btn> implements bvi<E>, byx<E> {
   private bvh.a a;

   public bws() {
      this.a = bvh.a.a;
   }

   @Override
   public final bvh.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aqu $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bvh.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqu $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aqu $$0, E $$1, long $$2) {
      this.a = bvh.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
