public abstract class bnk<E extends bkj> implements bmb<E>, bpp<E> {
   private bma.a a;

   public bnk() {
      this.a = bma.a.a;
   }

   @Override
   public final bma.a a() {
      return this.a;
   }

   @Override
   public final boolean e(alq $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bma.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(alq $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(alq $$0, E $$1, long $$2) {
      this.a = bma.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
