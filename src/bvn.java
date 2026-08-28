public class bvn implements bve<btk> {
   private final int a;
   private final int b;
   private bvd.a c = bvd.a.a;
   private long d;

   public bvn(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bvd.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arb $$0, btk $$1, long $$2) {
      this.c = bvd.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(arb $$0, btk $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arb $$0, btk $$1, long $$2) {
      this.c = bvd.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
