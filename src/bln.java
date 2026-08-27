public class bln implements ble<bjm> {
   private final int a;
   private final int b;
   private bld.a c = bld.a.a;
   private long d;

   public bln(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bld.a a() {
      return this.c;
   }

   @Override
   public final boolean e(akt $$0, bjm $$1, long $$2) {
      this.c = bld.a.b;
      int $$3 = this.a + $$0.D_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(akt $$0, bjm $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(akt $$0, bjm $$1, long $$2) {
      this.c = bld.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
