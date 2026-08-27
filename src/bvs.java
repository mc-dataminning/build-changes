public abstract class bvs<E extends bso> implements bui<E>, bxx<E> {
   private buh.a a;

   public bvs() {
      this.a = buh.a.a;
   }

   @Override
   public final buh.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aqm $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = buh.a.b;
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
      this.a = buh.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
