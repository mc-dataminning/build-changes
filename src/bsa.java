public abstract class bsa<E extends box> implements bqq<E>, buf<E> {
   private bqp.a a;

   public bsa() {
      this.a = bqp.a.a;
   }

   @Override
   public final bqp.a a() {
      return this.a;
   }

   @Override
   public final boolean e(apa $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bqp.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(apa $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(apa $$0, E $$1, long $$2) {
      this.a = bqp.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
