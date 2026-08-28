public class bvp implements bvg<btl> {
   private final int a;
   private final int b;
   private bvf.a c = bvf.a.a;
   private long d;

   public bvp(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bvf.a a() {
      return this.c;
   }

   @Override
   public final boolean e(aqt $$0, btl $$1, long $$2) {
      this.c = bvf.a.b;
      int $$3 = this.a + $$0.E_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(aqt $$0, btl $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqt $$0, btl $$1, long $$2) {
      this.c = bvf.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
