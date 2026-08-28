public abstract class bwu<E extends btq> implements bvk<E>, byz<E> {
   private bvj.a a;

   public bwu() {
      this.a = bvj.a.a;
   }

   @Override
   public final bvj.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arf $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bvj.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arf $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arf $$0, E $$1, long $$2) {
      this.a = bvj.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
