public abstract class bzt<E extends bwr> implements byj<E>, cby<E> {
   private byi.a a;

   public bzt() {
      this.a = byi.a.a;
   }

   @Override
   public final byi.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arn $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = byi.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arn $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arn $$0, E $$1, long $$2) {
      this.a = byi.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
