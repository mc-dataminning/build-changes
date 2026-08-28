public abstract class bwt<E extends btp> implements bvj<E>, byy<E> {
   private bvi.a a;

   public bwt() {
      this.a = bvi.a.a;
   }

   @Override
   public final bvi.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arf $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bvi.a.b;
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
      this.a = bvi.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
