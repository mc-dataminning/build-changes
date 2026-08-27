public abstract class bss<E extends bpp> implements bri<E>, bux<E> {
   private brh.a a;

   public bss() {
      this.a = brh.a.a;
   }

   @Override
   public final brh.a a() {
      return this.a;
   }

   @Override
   public final boolean e(apf $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = brh.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(apf $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(apf $$0, E $$1, long $$2) {
      this.a = brh.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
