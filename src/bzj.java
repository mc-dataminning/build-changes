public abstract class bzj<E extends bwf> implements bxz<E>, cbo<E> {
   private bxy.a a;

   public bzj() {
      this.a = bxy.a.a;
   }

   @Override
   public final bxy.a a() {
      return this.a;
   }

   @Override
   public final boolean e(ash $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bxy.a.b;
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
      this.a = bxy.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
