public abstract class btw<E extends bqt> implements bsm<E>, bwb<E> {
   private bsl.a a;

   public btw() {
      this.a = bsl.a.a;
   }

   @Override
   public final bsl.a a() {
      return this.a;
   }

   @Override
   public final boolean e(apu $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bsl.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(apu $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(apu $$0, E $$1, long $$2) {
      this.a = bsl.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
