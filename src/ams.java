public record ams(String b, int c, cfg d, boolean e, int f, bmf g, boolean h, boolean i) {
   public static final int a = 16;

   public ams(ui $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cfg.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bmf.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(ui $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static ams a() {
      return new ams("en_us", 2, cfg.a, true, 0, cfi.bB, false, false);
   }
}
