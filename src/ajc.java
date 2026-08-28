public record ajc(int b, ajp c) implements zf<ajb> {
   public static final yw<vu, ajc> a = zf.a(ajc::a, ajc::new);
   private static final int d = 1048576;

   private ajc(vu $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajp a(alg $$0, vu $$1) {
      return b($$0, $$1);
   }

   private static ajr b(alg $$0, vu $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new ajr($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zh<ajc> a() {
      return ajh.a;
   }

   public void a(ajb $$0) {
      $$0.a(this);
   }

   public ajp e() {
      return this.c;
   }
}
