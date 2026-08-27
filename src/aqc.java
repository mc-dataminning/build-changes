public record aqc(String b, int c, clw d, boolean e, int f, bsk g, boolean h, boolean i) {
   public static final int a = 16;

   public aqc(vx $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(clw.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bsk.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(vx $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static aqc a() {
      return new aqc("en_us", 2, clw.a, true, 0, cly.bF, false, false);
   }
}
