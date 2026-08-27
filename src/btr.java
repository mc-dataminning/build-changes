public abstract class btr<E extends bqo> implements bsh<E>, bvw<E> {
   private bsg.a a;

   public btr() {
      this.a = bsg.a.a;
   }

   @Override
   public final bsg.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aps $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bsg.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aps $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aps $$0, E $$1, long $$2) {
      this.a = bsg.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
