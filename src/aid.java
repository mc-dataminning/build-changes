public record aid(int b, aiq c) implements yz<aic> {
   public static final yq<vs, aid> a = yz.a(aid::a, aid::new);
   private static final int d = 1048576;

   private aid(vs $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static aiq a(akf $$0, vs $$1) {
      return b($$0, $$1);
   }

   private static ais b(akf $$0, vs $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new ais($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zb<aid> a() {
      return aii.a;
   }

   public void a(aic $$0) {
      $$0.a(this);
   }

   public aiq e() {
      return this.c;
   }
}
