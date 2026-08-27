public class bnm implements bnd<bll> {
   private final int a;
   private final int b;
   private bnc.a c = bnc.a.a;
   private long d;

   public bnm(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bnc.a a() {
      return this.c;
   }

   @Override
   public final boolean e(ami $$0, bll $$1, long $$2) {
      this.c = bnc.a.b;
      int $$3 = this.a + $$0.F_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(ami $$0, bll $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ami $$0, bll $$1, long $$2) {
      this.c = bnc.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
