public record aou(String b, int c, ciq d, boolean e, int f, bpi g, boolean h, boolean i) {
   public static final int a = 16;

   public aou(uu $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(ciq.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bpi.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(uu $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static aou a() {
      return new aou("en_us", 2, ciq.a, true, 0, cis.bF, false, false);
   }
}
