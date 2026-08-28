public record ajn(int b, aka c) implements zo<ajm> {
   public static final ze<vy, ajn> a = zo.a(ajn::a, ajn::new);
   private static final int d = 1048576;

   private ajn(vy $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static aka a(alr $$0, vy $$1) {
      return b($$0, $$1);
   }

   private static akc b(alr $$0, vy $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new akc($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zq<ajn> a() {
      return ajs.a;
   }

   public void a(ajm $$0) {
      $$0.a(this);
   }

   public aka e() {
      return this.c;
   }
}
