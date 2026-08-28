public abstract class byl<E extends bvh> implements bxb<E>, caq<E> {
   private bxa.a a;

   public byl() {
      this.a = bxa.a.a;
   }

   @Override
   public final bxa.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arp $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bxa.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arp $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arp $$0, E $$1, long $$2) {
      this.a = bxa.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
