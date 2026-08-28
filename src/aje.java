public record aje(int b, ajr c) implements zh<ajd> {
   public static final yy<vw, aje> a = zh.a(aje::a, aje::new);
   private static final int d = 1048576;

   private aje(vw $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajr a(ali $$0, vw $$1) {
      return b($$0, $$1);
   }

   private static ajt b(ali $$0, vw $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new ajt($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zj<aje> a() {
      return ajj.a;
   }

   public void a(ajd $$0) {
      $$0.a(this);
   }

   public ajr e() {
      return this.c;
   }
}
