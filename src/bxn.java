public abstract class bxn<E extends buk> implements bwd<E>, bzs<E> {
   private bwc.a a;

   public bxn() {
      this.a = bwc.a.a;
   }

   @Override
   public final bwc.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arh $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bwc.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arh $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arh $$0, E $$1, long $$2) {
      this.a = bwc.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
