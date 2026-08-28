public record aqg(String b, int c, cmt d, boolean e, int f, btf g, boolean h, boolean i) {
   public static final int a = 16;

   public aqg(vv $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cmt.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(btf.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(vv $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static aqg a() {
      return new aqg("en_us", 2, cmt.a, true, 0, cmv.bH, false, false);
   }
}
