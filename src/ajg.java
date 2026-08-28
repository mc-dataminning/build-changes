public record ajg(int b, ajt c) implements zj<ajf> {
   public static final za<vy, ajg> a = zj.a(ajg::a, ajg::new);
   private static final int d = 1048576;

   private ajg(vy $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajt a(alk $$0, vy $$1) {
      return b($$0, $$1);
   }

   private static ajv b(alk $$0, vy $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new ajv($$0);
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
   public zl<ajg> a() {
      return ajl.a;
   }

   public void a(ajf $$0) {
      $$0.a(this);
   }

   public ajt e() {
      return this.c;
   }
}
