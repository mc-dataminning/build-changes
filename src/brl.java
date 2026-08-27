public abstract class brl<E extends boi> implements bqb<E>, btq<E> {
   private bqa.a a;

   public brl() {
      this.a = bqa.a.a;
   }

   @Override
   public final bqa.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aow $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bqa.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aow $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aow $$0, E $$1, long $$2) {
      this.a = bqa.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
