public class bwy implements bwp<buv> {
   private final int a;
   private final int b;
   private bwo.a c = bwo.a.a;
   private long d;

   public bwy(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bwo.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arm $$0, buv $$1, long $$2) {
      this.c = bwo.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(arm $$0, buv $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arm $$0, buv $$1, long $$2) {
      this.c = bwo.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
