public record ajf(int b, ajs c) implements zq<aje> {
   public static final zh<wg, ajf> a = zq.a(ajf::a, ajf::new);
   private static final int d = 1048576;

   private ajf(wg $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajs a(alj $$0, wg $$1) {
      return b($$0, $$1);
   }

   private static aju b(alj $$0, wg $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new aju($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zs<ajf> a() {
      return ajk.a;
   }

   public void a(aje $$0) {
      $$0.a(this);
   }

   public ajs e() {
      return this.c;
   }
}
