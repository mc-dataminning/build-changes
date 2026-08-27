public record aed(int a, aeo b) implements wb<aec> {
   private static final int c = 1048576;

   public aed(tl $$0) {
      this($$0.n(), a($$0.t(), $$0));
   }

   private static aeo a(afw $$0, tl $$1) {
      return b($$0, $$1);
   }

   private static aeq b(afw $$0, tl $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new aeq($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(aec $$0) {
      $$0.a(this);
   }

   public aeo d() {
      return this.b;
   }
}
