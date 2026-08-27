public abstract class brh<E extends bog> implements bpx<E>, btm<E> {
   private bpw.a a;

   public brh() {
      this.a = bpw.a.a;
   }

   @Override
   public final bpw.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aov $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bpw.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aov $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aov $$0, E $$1, long $$2) {
      this.a = bpw.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
