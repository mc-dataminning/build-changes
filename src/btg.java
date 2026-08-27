public class btg implements bsx<bre> {
   private final int a;
   private final int b;
   private bsw.a c = bsw.a.a;
   private long d;

   public btg(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bsw.a a() {
      return this.c;
   }

   @Override
   public final boolean e(aqe $$0, bre $$1, long $$2) {
      this.c = bsw.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(aqe $$0, bre $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqe $$0, bre $$1, long $$2) {
      this.c = bsw.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
