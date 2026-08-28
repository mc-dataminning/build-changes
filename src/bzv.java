public class bzv implements bzm<bxu> {
   private final int a;
   private final int b;
   private bzl.a c = bzl.a.a;
   private long d;

   public bzv(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bzl.a a() {
      return this.c;
   }

   @Override
   public final boolean e(ars $$0, bxu $$1, long $$2) {
      this.c = bzl.a.b;
      int $$3 = this.a + $$0.G_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(ars $$0, bxu $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ars $$0, bxu $$1, long $$2) {
      this.c = bzl.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
