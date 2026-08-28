public record ajl(int b, ajy c) implements zr<ajk> {
   public static final zi<wh, ajl> a = zr.a(ajl::a, ajl::new);
   private static final int d = 1048576;

   private ajl(wh $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajy a(alp $$0, wh $$1) {
      return b($$0, $$1);
   }

   private static aka b(alp $$0, wh $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new aka($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(wh $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zt<ajl> a() {
      return ajq.a;
   }

   public void a(ajk $$0) {
      $$0.a(this);
   }

   public ajy e() {
      return this.c;
   }
}
