public record aqt(String b, int c, cmu d, boolean e, int f, bti g, boolean h, boolean i) {
   public static final int a = 16;

   public aqt(wl $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cmu.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bti.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(wl $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static aqt a() {
      return new aqt("en_us", 2, cmu.a, true, 0, cmw.bF, false, false);
   }
}
