public class bxd implements bwu<bva> {
   private final int a;
   private final int b;
   private bwt.a c = bwt.a.a;
   private long d;

   public bxd(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bwt.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arn $$0, bva $$1, long $$2) {
      this.c = bwt.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(arn $$0, bva $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arn $$0, bva $$1, long $$2) {
      this.c = bwt.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
