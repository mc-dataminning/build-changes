public abstract class bnz<E extends bky> implements bmq<E>, bqe<E> {
   private bmp.a a;

   public bnz() {
      this.a = bmp.a.a;
   }

   @Override
   public final bmp.a a() {
      return this.a;
   }

   @Override
   public final boolean e(ama $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bmp.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ama $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(ama $$0, E $$1, long $$2) {
      this.a = bmp.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
