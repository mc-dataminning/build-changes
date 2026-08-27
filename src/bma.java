public abstract class bma<E extends biy> implements bkr<E>, bof<E> {
   private bkq.a a;

   public bma() {
      this.a = bkq.a.a;
   }

   @Override
   public final bkq.a a() {
      return this.a;
   }

   @Override
   public final boolean e(akk $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bkq.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(akk $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(akk $$0, E $$1, long $$2) {
      this.a = bkq.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
