public class brq implements brh<bpo> {
   private final int a;
   private final int b;
   private brg.a c = brg.a.a;
   private long d;

   public brq(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public brg.a a() {
      return this.c;
   }

   @Override
   public final boolean e(apf $$0, bpo $$1, long $$2) {
      this.c = brg.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(apf $$0, bpo $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(apf $$0, bpo $$1, long $$2) {
      this.c = brg.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
