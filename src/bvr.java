public class bvr implements bvi<bto> {
   private final int a;
   private final int b;
   private bvh.a c = bvh.a.a;
   private long d;

   public bvr(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bvh.a a() {
      return this.c;
   }

   @Override
   public final boolean e(are $$0, bto $$1, long $$2) {
      this.c = bvh.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(are $$0, bto $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(are $$0, bto $$1, long $$2) {
      this.c = bvh.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
