public class bmk implements bmb<bkj> {
   private final int a;
   private final int b;
   private bma.a c = bma.a.a;
   private long d;

   public bmk(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bma.a a() {
      return this.c;
   }

   @Override
   public final boolean e(alq $$0, bkj $$1, long $$2) {
      this.c = bma.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(alq $$0, bkj $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(alq $$0, bkj $$1, long $$2) {
      this.c = bma.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
