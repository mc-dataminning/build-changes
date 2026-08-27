public record adf(int a, adq b) implements vd<ade> {
   private static final int c = 1048576;

   public adf(so $$0) {
      this($$0.m(), a($$0.s(), $$0));
   }

   private static adq a(aew $$0, so $$1) {
      return b($$0, $$1);
   }

   private static ads b(aew $$0, so $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new ads($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(ade $$0) {
      $$0.a(this);
   }

   public adq d() {
      return this.b;
   }
}
