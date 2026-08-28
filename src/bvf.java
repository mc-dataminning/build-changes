public class bvf implements buw<btc> {
   private final int a;
   private final int b;
   private buv.a c = buv.a.a;
   private long d;

   public bvf(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public buv.a a() {
      return this.c;
   }

   @Override
   public final boolean e(aqm $$0, btc $$1, long $$2) {
      this.c = buv.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(aqm $$0, btc $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqm $$0, btc $$1, long $$2) {
      this.c = buv.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
