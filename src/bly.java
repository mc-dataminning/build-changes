public abstract class bly<E extends biw> implements bkp<E>, bod<E> {
   private bko.a a;

   public bly() {
      this.a = bko.a.a;
   }

   @Override
   public final bko.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aki $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bko.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aki $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aki $$0, E $$1, long $$2) {
      this.a = bko.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
