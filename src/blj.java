public class blj implements bla<bji> {
   private final int a;
   private final int b;
   private bkz.a c = bkz.a.a;
   private long d;

   public blj(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bkz.a a() {
      return this.c;
   }

   @Override
   public final boolean e(aks $$0, bji $$1, long $$2) {
      this.c = bkz.a.b;
      int $$3 = this.a + $$0.D_().a(this.b + 1 - this.a);
      this.d = $$2 + (long)$$3;
      return true;
   }

   @Override
   public final void f(aks $$0, bji $$1, long $$2) {
      if ($$2 > this.d) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aks $$0, bji $$1, long $$2) {
      this.c = bkz.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
