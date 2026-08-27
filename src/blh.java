public class blh implements bky<bjg> {
   private final int a;
   private final int b;
   private bkx.a c = bkx.a.a;
   private long d;

   public blh(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bkx.a a() {
      return this.c;
   }

   @Override
   public final boolean e(akr $$0, bjg $$1, long $$2) {
      this.c = bkx.a.b;
      int $$3 = this.a + $$0.D_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(akr $$0, bjg $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(akr $$0, bjg $$1, long $$2) {
      this.c = bkx.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
