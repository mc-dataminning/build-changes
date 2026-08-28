public class bxi implements bwz<bvf> {
   private final int a;
   private final int b;
   private bwy.a c = bwy.a.a;
   private long d;

   public bxi(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bwy.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arc $$0, bvf $$1, long $$2) {
      this.c = bwy.a.b;
      int $$3 = this.a + $$0.H_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(arc $$0, bvf $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arc $$0, bvf $$1, long $$2) {
      this.c = bwy.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
