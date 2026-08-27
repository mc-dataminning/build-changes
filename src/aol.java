public record aol(String b, int c, chj d, boolean e, int f, boc g, boolean h, boolean i) {
   public static final int a = 16;

   public aol(uq $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(chj.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(boc.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(uq $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static aol a() {
      return new aol("en_us", 2, chj.a, true, 0, chl.bC, false, false);
   }
}
