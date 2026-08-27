public record aen(int a, aey b) implements wk<aem> {
   private static final int c = 1048576;

   public aen(tu $$0) {
      this($$0.n(), a($$0.t(), $$0));
   }

   private static aey a(agg $$0, tu $$1) {
      return b($$0, $$1);
   }

   private static afa b(agg $$0, tu $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new afa($$0);
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

   public void a(aem $$0) {
      $$0.a(this);
   }

   public aey d() {
      return this.b;
   }
}
