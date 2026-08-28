public class bvu implements bvl<btr> {
   private final int a;
   private final int b;
   private bvk.a c = bvk.a.a;
   private long d;

   public bvu(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bvk.a a() {
      return this.c;
   }

   @Override
   public final boolean e(arf $$0, btr $$1, long $$2) {
      this.c = bvk.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(arf $$0, btr $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arf $$0, btr $$1, long $$2) {
      this.c = bvk.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
