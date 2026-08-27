public abstract class bpn<E extends bml> implements bod<E>, brs<E> {
   private boc.a a;

   public bpn() {
      this.a = boc.a.a;
   }

   @Override
   public final boc.a a() {
      return this.a;
   }

   @Override
   public final boolean e(and $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = boc.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(and $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(and $$0, E $$1, long $$2) {
      this.a = boc.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
