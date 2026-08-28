public record aje(int b, ajr c) implements zp<ajd> {
   public static final zg<wf, aje> a = zp.a(aje::a, aje::new);
   private static final int d = 1048576;

   private aje(wf $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajr a(ali $$0, wf $$1) {
      return b($$0, $$1);
   }

   private static ajt b(ali $$0, wf $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new ajt($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zr<aje> a() {
      return ajj.a;
   }

   public void a(ajd $$0) {
      $$0.a(this);
   }

   public ajr e() {
      return this.c;
   }
}
