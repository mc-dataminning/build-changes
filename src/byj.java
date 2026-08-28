public abstract class byj<E extends bvf> implements bwz<E>, cao<E> {
   private bwy.a a;

   public byj() {
      this.a = bwy.a.a;
   }

   @Override
   public final bwy.a a() {
      return this.a;
   }

   @Override
   public final boolean e(arc $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bwy.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arc $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(arc $$0, E $$1, long $$2) {
      this.a = bwy.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
