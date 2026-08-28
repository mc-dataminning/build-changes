public record ajv(int b, aki c) implements aac<aju> {
   public static final zt<ws, ajv> a = aac.a(ajv::a, ajv::new);
   private static final int d = 1048576;

   private ajv(ws $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static aki a(alz $$0, ws $$1) {
      return b($$0, $$1);
   }

   private static akk b(alz $$0, ws $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new akk($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public aae<ajv> a() {
      return aka.a;
   }

   public void a(aju $$0) {
      $$0.a(this);
   }

   public aki e() {
      return this.c;
   }
}
