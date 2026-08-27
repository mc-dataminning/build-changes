public record adg(int a, adr b) implements ve<adf> {
   private static final int c = 1048576;

   public adg(so $$0) {
      this($$0.n(), a($$0.t(), $$0));
   }

   private static adr a(aez $$0, so $$1) {
      return b($$0, $$1);
   }

   private static adt b(aez $$0, so $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new adt($$0);
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

   public void a(adf $$0) {
      $$0.a(this);
   }

   public adr d() {
      return this.b;
   }
}
