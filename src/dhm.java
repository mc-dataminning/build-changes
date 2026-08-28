public final class dhm implements dzf {
   private final int a;
   private final dxn[] b;

   public dhm(int $$0, dxn[] $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dxn a(int $$0) {
      int $$1 = $$0 - this.a;
      return $$1 >= 0 && $$1 < this.b.length ? this.b[$$1] : dkg.a.m();
   }

   @Override
   public void a(int $$0, dxn $$1) {
      int $$2 = $$0 - this.a;
      if ($$2 >= 0 && $$2 < this.b.length) {
         this.b[$$2] = $$1;
      } else {
         throw new IllegalArgumentException("Outside of column height: " + $$0);
      }
   }
}
