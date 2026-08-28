public abstract class byk<E extends bvg> implements bxa<E>, cap<E> {
   private bwz.a a;

   public byk() {
      this.a = bwz.a.a;
   }

   @Override
   public final bwz.a a() {
      return this.a;
   }

   @Override
   public final boolean e(ard $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bwz.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ard $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(ard $$0, E $$1, long $$2) {
      this.a = bwz.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
