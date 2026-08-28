public final class dib implements eag {
   private final int a;
   private final dym[] b;

   public dib(int $$0, dym[] $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public dym a(int $$0) {
      int $$1 = $$0 - this.a;
      return $$1 >= 0 && $$1 < this.b.length ? this.b[$$1] : dkw.a.m();
   }

   @Override
   public void a(int $$0, dym $$1) {
      int $$2 = $$0 - this.a;
      if ($$2 >= 0 && $$2 < this.b.length) {
         this.b[$$2] = $$1;
      } else {
         throw new IllegalArgumentException("Outside of column height: " + $$0);
      }
   }
}
