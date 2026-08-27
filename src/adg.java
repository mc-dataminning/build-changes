public record adg(int a, adr b) implements ve<adf> {
   private static final int c = 1048576;

   public adg(sp $$0) {
      this($$0.m(), a($$0.s(), $$0));
   }

   private static adr a(aex $$0, sp $$1) {
      return b($$0, $$1);
   }

   private static adt b(aex $$0, sp $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new adt($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sp $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(adf $$0) {
      $$0.a(this);
   }

   public adr d() {
      return this.b;
   }
}
