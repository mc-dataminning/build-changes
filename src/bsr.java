public abstract class bsr<E extends bpo> implements brh<E>, buw<E> {
   private brg.a a;

   public bsr() {
      this.a = brg.a.a;
   }

   @Override
   public final brg.a a() {
      return this.a;
   }

   @Override
   public final boolean e(apf $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = brg.a.b;
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
      this.a = brg.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
