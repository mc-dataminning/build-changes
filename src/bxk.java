public class bxk implements bxb<bvh> {
   private final int a;
   private final int b;
   private bxa.a c = bxa.a.a;
   private long d;

   public bxk(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bxa.a a() {
      return this.c;
   }

   @Override
   public final boolean e(ard $$0, bvh $$1, long $$2) {
      this.c = bxa.a.b;
      int $$3 = this.a + $$0.H_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(ard $$0, bvh $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ard $$0, bvh $$1, long $$2) {
      this.c = bxa.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
