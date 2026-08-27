public abstract class bvd<E extends bsa> implements btt<E>, bxi<E> {
   private bts.a a;

   public bvd() {
      this.a = bts.a.a;
   }

   @Override
   public final bts.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aqh $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bts.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqh $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aqh $$0, E $$1, long $$2) {
      this.a = bts.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
