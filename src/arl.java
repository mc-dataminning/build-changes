public record arl(String b, int c, csf d, boolean e, int f, bxw g, boolean h, boolean i, art j) {
   public static final int a = 16;

   public arl(vy $$0) {
      this(
         $$0.d(16),
         $$0.readByte(),
         $$0.b(csf.class),
         $$0.readBoolean(),
         $$0.readUnsignedByte(),
         $$0.b(bxw.class),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(art.class)
      );
   }

   public void a(vy $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.a(this.j);
   }

   public static arl a() {
      return new arl("en_us", 2, csf.a, true, 0, csi.bu, false, false, art.a);
   }
}
