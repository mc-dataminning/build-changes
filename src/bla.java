public class bla implements bkr<biy> {
   private final int a;
   private final int b;
   private bkq.a c = bkq.a.a;
   private long d;

   public bla(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bkq.a a() {
      return this.c;
   }

   @Override
   public final boolean e(akk $$0, biy $$1, long $$2) {
      this.c = bkq.a.b;
      int $$3 = this.a + $$0.y_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(akk $$0, biy $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(akk $$0, biy $$1, long $$2) {
      this.c = bkq.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
