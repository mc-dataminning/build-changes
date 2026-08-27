public class bky implements bkp<biw> {
   private final int a;
   private final int b;
   private bko.a c = bko.a.a;
   private long d;

   public bky(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bko.a a() {
      return this.c;
   }

   @Override
   public final boolean e(aki $$0, biw $$1, long $$2) {
      this.c = bko.a.b;
      int $$3 = this.a + $$0.y_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(aki $$0, biw $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aki $$0, biw $$1, long $$2) {
      this.c = bko.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
