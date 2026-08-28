public class byi implements bxz<bwf> {
   private final int a;
   private final int b;
   private bxy.a c = bxy.a.a;
   private long d;

   public byi(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bxy.a a() {
      return this.c;
   }

   @Override
   public final boolean e(ash $$0, bwf $$1, long $$2) {
      this.c = bxy.a.b;
      int $$3 = this.a + $$0.H_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(ash $$0, bwf $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ash $$0, bwf $$1, long $$2) {
      this.c = bxy.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
