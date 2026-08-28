public abstract class caw<E extends bxu> implements bzm<E>, cdb<E> {
   private bzl.a a;

   public caw() {
      this.a = bzl.a.a;
   }

   @Override
   public final bzl.a a() {
      return this.a;
   }

   @Override
   public final boolean e(ars $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = bzl.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ars $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(ars $$0, E $$1, long $$2) {
      this.a = bzl.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
