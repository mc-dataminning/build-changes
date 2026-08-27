public abstract class blz<E extends biy> implements bkq<E>, boe<E> {
   private bkp.a a;

   public blz() {
      this.a = bkp.a.a;
   }

   @Override
   public final bkp.a a() {
      return this.a;
   }

   @Override
   public final boolean e(akk $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bkp.a.b;
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
      this.a = bkp.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
