public abstract class bvr<E extends bso> implements buh<E>, bxw<E> {
   private bug.a a;

   public bvr() {
      this.a = bug.a.a;
   }

   @Override
   public final bug.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aqt $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bug.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqt $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aqt $$0, E $$1, long $$2) {
      this.a = bug.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
