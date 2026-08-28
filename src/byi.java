public abstract class byi<E extends bve> implements bwy<E>, can<E> {
   private bwx.a a;

   public byi() {
      this.a = bwx.a.a;
   }

   @Override
   public final bwx.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arq $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bwx.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arq $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arq $$0, E $$1, long $$2) {
      this.a = bwx.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
