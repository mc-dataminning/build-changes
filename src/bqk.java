public class bqk implements bqb<boi> {
   private final int a;
   private final int b;
   private bqa.a c = bqa.a.a;
   private long d;

   public bqk(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bqa.a a() {
      return this.c;
   }

   @Override
   public final boolean e(aow $$0, boi $$1, long $$2) {
      this.c = bqa.a.b;
      int $$3 = this.a + $$0.F_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(aow $$0, boi $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aow $$0, boi $$1, long $$2) {
      this.c = bqa.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
