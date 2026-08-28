public class bwp implements bwg<bun> {
   private final int a;
   private final int b;
   private bwf.a c = bwf.a.a;
   private long d;

   public bwp(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bwf.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arj $$0, bun $$1, long $$2) {
      this.c = bwf.a.b;
      int $$3 = this.a + $$0.D_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(arj $$0, bun $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arj $$0, bun $$1, long $$2) {
      this.c = bwf.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
