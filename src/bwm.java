public class bwm implements bwd<buk> {
   private final int a;
   private final int b;
   private bwc.a c = bwc.a.a;
   private long d;

   public bwm(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bwc.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arh $$0, buk $$1, long $$2) {
      this.c = bwc.a.b;
      int $$3 = this.a + $$0.C_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(arh $$0, buk $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arh $$0, buk $$1, long $$2) {
      this.c = bwc.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
