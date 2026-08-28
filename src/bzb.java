public abstract class bzb<E extends bvx> implements bxr<E>, cbg<E> {
   private bxq.a a;

   public bzb() {
      this.a = bxq.a.a;
   }

   @Override
   public final bxq.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arx $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bxq.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arx $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arx $$0, E $$1, long $$2) {
      this.a = bxq.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
