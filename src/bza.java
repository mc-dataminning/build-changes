public class bza implements byr<bwz> {
   private final int a;
   private final int b;
   private byq.a c = byq.a.a;
   private long d;

   public bza(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public byq.a a() {
      return this.c;
   }

   @Override
   public final boolean e(aro $$0, bwz $$1, long $$2) {
      this.c = byq.a.b;
      int $$3 = this.a + $$0.C_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(aro $$0, bwz $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aro $$0, bwz $$1, long $$2) {
      this.c = byq.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
