public class bzx implements bzo<bxw> {
   private final int a;
   private final int b;
   private bzn.a c = bzn.a.a;
   private long d;

   public bzx(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bzn.a a() {
      return this.c;
   }

   @Override
   public final boolean e(aru $$0, bxw $$1, long $$2) {
      this.c = bzn.a.b;
      int $$3 = this.a + $$0.G_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(aru $$0, bxw $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aru $$0, bxw $$1, long $$2) {
      this.c = bzn.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
