public record aet(int a, afe b) implements wo<aes> {
   private static final int c = 1048576;

   public aet(ty $$0) {
      this($$0.n(), a($$0.t(), $$0));
   }

   private static afe a(agm $$0, ty $$1) {
      return b($$0, $$1);
   }

   private static afg b(agm $$0, ty $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new afg($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   public afe d() {
      return this.b;
   }
}
