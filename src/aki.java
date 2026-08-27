public record aki(String b, int c, cby d, boolean e, int f, bjg g, boolean h, boolean i) {
   public static final int a = 16;

   public aki(so $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cby.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bjg.class), $$0.readBoolean(), $$0.readBoolean());
   }

   public void a(so $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public static aki a() {
      return new aki("en_us", 2, cby.a, true, 0, cca.bB, false, false);
   }
}
