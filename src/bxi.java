public abstract class bxi<E extends buf> implements bvy<E>, bzn<E> {
   private bvx.a a;

   public bxi() {
      this.a = bvx.a.a;
   }

   @Override
   public final bvx.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arg $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bvx.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arg $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arg $$0, E $$1, long $$2) {
      this.a = bvx.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
