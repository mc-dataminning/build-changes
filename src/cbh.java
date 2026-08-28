public abstract class cbh<E extends byf> implements bzx<E>, cdm<E> {
   private bzw.a a;

   public cbh() {
      this.a = bzw.a.a;
   }

   @Override
   public final bzw.a a() {
      return this.a;
   }

   @Override
   public final boolean e(asb $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bzw.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(asb $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(asb $$0, E $$1, long $$2) {
      this.a = bzw.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
