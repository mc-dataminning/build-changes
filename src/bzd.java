public class bzd implements byu<bxc> {
   private final int a;
   private final int b;
   private byt.a c = byt.a.a;
   private long d;

   public bzd(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public byt.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arq $$0, bxc $$1, long $$2) {
      this.c = byt.a.b;
      int $$3 = this.a + $$0.C_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(arq $$0, bxc $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arq $$0, bxc $$1, long $$2) {
      this.c = byt.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
