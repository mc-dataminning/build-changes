public abstract class bvu<E extends bsq> implements buk<E>, bxz<E> {
   private buj.a a;

   public bvu() {
      this.a = buj.a.a;
   }

   @Override
   public final buj.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aqn $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = buj.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqn $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aqn $$0, E $$1, long $$2) {
      this.a = buj.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
