public abstract class bxq<E extends bun> implements bwg<E>, bzv<E> {
   private bwf.a a;

   public bxq() {
      this.a = bwf.a.a;
   }

   @Override
   public final bwf.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arj $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bwf.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arj $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arj $$0, E $$1, long $$2) {
      this.a = bwf.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
