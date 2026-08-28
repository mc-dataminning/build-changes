public class bwh implements bvy<buf> {
   private final int a;
   private final int b;
   private bvx.a c = bvx.a.a;
   private long d;

   public bwh(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bvx.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arg $$0, buf $$1, long $$2) {
      this.c = bvx.a.b;
      int $$3 = this.a + $$0.C_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(arg $$0, buf $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arg $$0, buf $$1, long $$2) {
      this.c = bvx.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
