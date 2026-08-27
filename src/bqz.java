public class bqz implements bqq<box> {
   private final int a;
   private final int b;
   private bqp.a c = bqp.a.a;
   private long d;

   public bqz(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bqp.a a() {
      return this.c;
   }

   @Override
   public final boolean e(apa $$0, box $$1, long $$2) {
      this.c = bqp.a.b;
      int $$3 = this.a + $$0.F_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(apa $$0, box $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(apa $$0, box $$1, long $$2) {
      this.c = bqp.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
