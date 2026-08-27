public record alx(String b, int c, cdx d, boolean e, int f, blf g, boolean h, boolean i) {
   public static final int a = 16;

   public alx(ty $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cdx.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(blf.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(ty $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static alx a() {
      return new alx("en_us", 2, cdx.a, true, 0, cdz.bB, false, false);
   }
}
