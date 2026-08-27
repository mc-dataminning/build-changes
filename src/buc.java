public class buc implements btt<bsa> {
   private final int a;
   private final int b;
   private bts.a c = bts.a.a;
   private long d;

   public buc(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bts.a a() {
      return this.c;
   }

   @Override
   public final boolean e(aqh $$0, bsa $$1, long $$2) {
      this.c = bts.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(aqh $$0, bsa $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqh $$0, bsa $$1, long $$2) {
      this.c = bts.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
