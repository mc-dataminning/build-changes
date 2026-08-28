public abstract class bwr<E extends btn> implements bvh<E>, byw<E> {
   private bvg.a a;

   public bwr() {
      this.a = bvg.a.a;
   }

   @Override
   public final bvg.a a() {
      return this.a;
   }

   @Override
   public final boolean e(are $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bvg.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(are $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(are $$0, E $$1, long $$2) {
      this.a = bvg.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
