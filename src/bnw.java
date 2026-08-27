public class bnw implements bnn<blv> {
   private final int a;
   private final int b;
   private bnm.a c = bnm.a.a;
   private long d;

   public bnw(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bnm.a a() {
      return this.c;
   }

   @Override
   public final boolean e(amp $$0, blv $$1, long $$2) {
      this.c = bnm.a.b;
      int $$3 = this.a + $$0.F_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(amp $$0, blv $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(amp $$0, blv $$1, long $$2) {
      this.c = bnm.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
