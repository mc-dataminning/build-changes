public class bom implements bod<bml> {
   private final int a;
   private final int b;
   private boc.a c = boc.a.a;
   private long d;

   public bom(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public boc.a a() {
      return this.c;
   }

   @Override
   public final boolean e(and $$0, bml $$1, long $$2) {
      this.c = boc.a.b;
      int $$3 = this.a + $$0.F_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(and $$0, bml $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(and $$0, bml $$1, long $$2) {
      this.c = boc.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
