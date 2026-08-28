public abstract class bwo<E extends btk> implements bve<E>, byt<E> {
   private bvd.a a;

   public bwo() {
      this.a = bvd.a.a;
   }

   @Override
   public final bvd.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arb $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bvd.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arb $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arb $$0, E $$1, long $$2) {
      this.a = bvd.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
