public record adh(int a, ads b) implements vf<adg> {
   private static final int c = 1048576;

   public adh(sq $$0) {
      this($$0.m(), a($$0.s(), $$0));
   }

   private static ads a(aey $$0, sq $$1) {
      return b($$0, $$1);
   }

   private static adu b(aey $$0, sq $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new adu($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public ads d() {
      return this.b;
   }
}
