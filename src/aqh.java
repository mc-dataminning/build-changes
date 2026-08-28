public record aqh(String b, int c, cmv d, boolean e, int f, btg g, boolean h, boolean i) {
   public static final int a = 16;

   public aqh(vw $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cmv.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(btg.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(vw $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static aqh a() {
      return new aqh("en_us", 2, cmv.a, true, 0, cmx.bH, false, false);
   }
}
