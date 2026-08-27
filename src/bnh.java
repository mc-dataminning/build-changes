public class bnh implements bmy<blg> {
   private final int a;
   private final int b;
   private bmx.a c = bmx.a.a;
   private long d;

   public bnh(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bmx.a a() {
      return this.c;
   }

   @Override
   public final boolean e(ame $$0, blg $$1, long $$2) {
      this.c = bmx.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(ame $$0, blg $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ame $$0, blg $$1, long $$2) {
      this.c = bmx.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
