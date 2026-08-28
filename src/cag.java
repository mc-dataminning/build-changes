public class cag implements bzx<byf> {
   private final int a;
   private final int b;
   private bzw.a c = bzw.a.a;
   private long d;

   public cag(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bzw.a a() {
      return this.c;
   }

   @Override
   public final boolean e(asb $$0, byf $$1, long $$2) {
      this.c = bzw.a.b;
      int $$3 = this.a + $$0.G_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(asb $$0, byf $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(asb $$0, byf $$1, long $$2) {
      this.c = bzw.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
