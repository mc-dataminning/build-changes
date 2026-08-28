public abstract class bxz<E extends buv> implements bwp<E>, cae<E> {
   private bwo.a a;

   public bxz() {
      this.a = bwo.a.a;
   }

   @Override
   public final bwo.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arm $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bwo.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arm $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arm $$0, E $$1, long $$2) {
      this.a = bwo.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
