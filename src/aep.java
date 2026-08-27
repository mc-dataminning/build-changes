public record aep(int a, afa b) implements wk<aeo> {
   private static final int c = 1048576;

   public aep(tu $$0) {
      this($$0.n(), a($$0.t(), $$0));
   }

   private static afa a(agi $$0, tu $$1) {
      return b($$0, $$1);
   }

   private static afc b(agi $$0, tu $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new afc($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(aeo $$0) {
      $$0.a(this);
   }

   public afa d() {
      return this.b;
   }
}
