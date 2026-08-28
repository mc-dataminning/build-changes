public abstract class bwg<E extends btc> implements buw<E>, byl<E> {
   private buv.a a;

   public bwg() {
      this.a = buv.a.a;
   }

   @Override
   public final buv.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aqm $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = buv.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqm $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aqm $$0, E $$1, long $$2) {
      this.a = buv.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
