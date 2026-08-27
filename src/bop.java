public class bop implements bog<bmo> {
   private final int a;
   private final int b;
   private bof.a c = bof.a.a;
   private long d;

   public bop(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bof.a a() {
      return this.c;
   }

   @Override
   public final boolean e(ane $$0, bmo $$1, long $$2) {
      this.c = bof.a.b;
      int $$3 = this.a + $$0.F_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(ane $$0, bmo $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ane $$0, bmo $$1, long $$2) {
      this.c = bof.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
