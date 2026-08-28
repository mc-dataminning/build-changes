public record apz(String b, int c, cmf d, boolean e, int f, bss g, boolean h, boolean i) {
   public static final int a = 16;

   public apz(vr $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cmf.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bss.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(vr $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static apz a() {
      return new apz("en_us", 2, cmf.a, true, 0, cmh.bH, false, false);
   }
}
