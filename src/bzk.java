public abstract class bzk<E extends bwg> implements bya<E>, cbp<E> {
   private bxz.a a;

   public bzk() {
      this.a = bxz.a.a;
   }

   @Override
   public final bxz.a a() {
      return this.a;
   }

   @Override
   public final boolean e(ash $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bxz.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ash $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(ash $$0, E $$1, long $$2) {
      this.a = bxz.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
