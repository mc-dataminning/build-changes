public class bxl implements bxc<bvi> {
   private final int a;
   private final int b;
   private bxb.a c = bxb.a.a;
   private long d;

   public bxl(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bxb.a a() {
      return this.c;
   }

   @Override
   public final boolean e(ard $$0, bvi $$1, long $$2) {
      this.c = bxb.a.b;
      int $$3 = this.a + $$0.H_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(ard $$0, bvi $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ard $$0, bvi $$1, long $$2) {
      this.c = bxb.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
