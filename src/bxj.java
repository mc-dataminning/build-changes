public class bxj implements bxa<bvg> {
   private final int a;
   private final int b;
   private bwz.a c = bwz.a.a;
   private long d;

   public bxj(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bwz.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arc $$0, bvg $$1, long $$2) {
      this.c = bwz.a.b;
      int $$3 = this.a + $$0.H_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(arc $$0, bvg $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arc $$0, bvg $$1, long $$2) {
      this.c = bwz.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
