public record aph(String b, int c, cjr d, boolean e, int f, bqi g, boolean h, boolean i) {
   public static final int a = 16;

   public aph(vg $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cjr.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bqi.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(vg $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static aph a() {
      return new aph("en_us", 2, cjr.a, true, 0, cjt.bE, false, false);
   }
}
