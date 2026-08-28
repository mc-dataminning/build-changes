public abstract class bwv<E extends btr> implements bvl<E>, bza<E> {
   private bvk.a a;

   public bwv() {
      this.a = bvk.a.a;
   }

   @Override
   public final bvk.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arf $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bvk.a.b;
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
      this.a = bvk.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
