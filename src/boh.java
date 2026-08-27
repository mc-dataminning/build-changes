public abstract class boh<E extends blg> implements bmy<E>, bqm<E> {
   private bmx.a a;

   public boh() {
      this.a = bmx.a.a;
   }

   @Override
   public final bmx.a a() {
      return this.a;
   }

   @Override
   public final boolean e(ame $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bmx.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ame $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(ame $$0, E $$1, long $$2) {
      this.a = bmx.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
